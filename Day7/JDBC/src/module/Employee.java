package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	private static Connection connection;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Employee employee = new Employee();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee_db";
			String user = "root";
			String password = "Sa123";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Enter the choice you need");
			System.out.println("Enter 1 if you want to insert into Employee record");
			System.out.println("Enter 2 if you need to view particular Employee details");
			System.out.println("Enter 3 if you to view all the Employee records");
			System.out.println("Enter 4 if you to update an Employee record");
			System.out.println("Enter 5 if you to Delete an Employee record");
			System.out.println();

			int option = Integer.parseInt(scanner.next());

			switch (option) {
			case 1: {
				employee.insertRecord();
				break;
			}
			case 2: {
				employee.selectRecord();
				break;
			}
			case 3: {
				employee.selectAll();
				break;
			}
			case 4: {
				employee.updateRecord();
				break;
			}
			case 5: {
				employee.DeleteRecord();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private void updateRecord() throws SQLException {
		System.out.println("Enter the id to update employee details");
		int id = Integer.parseInt(scanner.next());

		String query = "Select * from employee where id =" + id;
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		if (resultSet.next()) {
			int eId = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double salary = resultSet.getDouble("salary");
			String deptName = resultSet.getString("deptName");

			System.out.println("Employee id : " + eId);
			System.out.println("Name : " + name);
			System.out.println("Salary : " + salary);
			System.out.println("Department : " + deptName);

			System.out.println("Enter the choice you need");
			System.out.println("Enter 1 if you want to update Employee name");
			System.out.println("Enter 2 if you want to update Employee salary");
			System.out.println("Enter 3 if you want to update Employee Depatment name");
			System.out.println();

			String updateQuery = "update employee set";
			int option = Integer.parseInt(scanner.next());
			switch (option) {
			case 1: {
				System.out.println("Enter Name");
				String newName = scanner.next();
				updateQuery = updateQuery + " name = ? where id =" + eId;

				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				preparedStatement.setString(1, newName);
				int row = preparedStatement.executeUpdate();
				if (row != 0)
					System.out.println("Record updated successfully");
				break;
			}
			case 2: {
				System.out.println("Enter salary");
				Double newSalary = scanner.nextDouble();
				updateQuery = updateQuery + " salary = ? where id =" + eId;

				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				preparedStatement.setDouble(1, newSalary);
				int row = preparedStatement.executeUpdate();
				if (row != 0)
					System.out.println("Record updated successfully");
				break;
			}
			case 3: {
				System.out.println("Enter Department");
				String newDept = scanner.next();
				updateQuery = updateQuery + " department = ? where id =" + eId;

				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				preparedStatement.setString(1, newDept);
				int row = preparedStatement.executeUpdate();
				if (row != 0)
					System.out.println("Record updated successfully");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}

		} else {
			System.out.println("No records found!");
		}

	}

	private void DeleteRecord() throws SQLException {
		System.out.println("Enter employee id to delete the record");
		int eId = Integer.parseInt(scanner.next());
		String deleteQuery = "delete from employee where id =" +eId;
		Statement statement = connection.createStatement();
		int row = statement.executeUpdate(deleteQuery);
		if(row != 0)
			System.out.println("Record deleted succesfully");

	}

	private void selectRecord() throws SQLException {
		while (true) {
			System.out.println("Enter the id to view employee details");
			int id = Integer.parseInt(scanner.next());

			String query = "Select * from employee where id =" + id;
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			if (resultSet.next()) {
				int eId = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				String deptName = resultSet.getString("deptName");

				System.out.println("Employee id : " + eId);
				System.out.println("Name : " + name);
				System.out.println("Salary : " + salary);
				System.out.println("Department : " + deptName);

			} else {
				System.out.println("No records found!");
			}
			System.out.println("If you want view other employee details");
			String response = scanner.next();
			if (response.equalsIgnoreCase("no"))
				break;

		}

	}

	private void selectAll() throws SQLException {
		String query = "Select * from employee";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		System.out.println("Employees details are");
		System.out.println();
		while (resultSet.next()) {
			int eId = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double salary = resultSet.getDouble("salary");
			String deptName = resultSet.getString("deptName");

			System.out.println("Employee id : " + eId);
			System.out.println("Name : " + name);
			System.out.println("Salary : " + salary);
			System.out.println("Department : " + deptName);
			System.out.println();

		}

	}

	private void insertRecord() throws SQLException {
		String query = "insert into employee(name, salary, deptName) values(?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		while (true) {
			System.out.println("Enter Employee name");
			preparedStatement.setString(1, scanner.next());
			System.out.println("Enter Employee salary");
			preparedStatement.setDouble(2, scanner.nextDouble());
			System.out.println("Enter Employee Department name");
			preparedStatement.setString(3, scanner.next());
			int rows = preparedStatement.executeUpdate();
			if (rows != 0)
				System.out.println("Record inserted Successfully..");
			System.out.println();
			System.out.println("If you want insert more Employee records");
			String response = scanner.next();
			if (response.equalsIgnoreCase("no"))
				break;
		}
	}
}
