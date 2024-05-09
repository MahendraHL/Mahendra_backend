package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class StudentDb {
	public static void main(String[] args) {
		try {
			Scanner s= new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			Connection con = DriverManager.getConnection(url, user, pass);
//			String query = "insert into student values(id,'John',78.2,'bangalore')";
//			String query = "insert into student(name,percentage,address) values ('Smith',70.2,'bangalore')";
//			Statement stmt=con.createStatement();
//			stmt.execute(query);
			String query = "insert into student(name,percentage,address) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			System.out.println("Enter name");
			ps.setString(1, s.next());
			System.out.println("Enter the percentage");
			ps.setDouble(2, s.nextDouble());
			System.out.println("Enter address");
			ps.setString(3, s.next());
			int ex=ps.executeUpdate();
			System.out.println(ex);
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}

}
