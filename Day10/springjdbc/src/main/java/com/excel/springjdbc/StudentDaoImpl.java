package com.excel.springjdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student (id,name,city) values(?,?,?)";
		return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
	}

	@Override
	public int updateData(Student student) {
		String query1 = "update student set name= ?,city=? where id =?";
		return jdbcTemplate.update(query1, student.getName(), student.getCity(), student.getId());
	}

	@Override
	public int delete(Student student) {
		String query = "delete from student where id=?";
		return jdbcTemplate.update(query, student.getId());

	}

	@Override
	public List<Map<String, Object>> select(Student student) {
		String sql = "Select * from student";
		List<Map<String, Object>> st = jdbcTemplate.queryForList(sql);
		if (st != null && !st.isEmpty()) {

			for (Map<String, Object> stu : st) {

				for (Iterator<Map.Entry<String, Object>> it = stu.entrySet().iterator(); it.hasNext();) {
					Map.Entry<String, Object> entry = it.next();
					String key = entry.getKey();
					Object value = entry.getValue();
					System.out.println(key + " = " + value);
				}

				System.out.println();

			}
		}
		return st;
	}

	@Override
	public int selectOneRecord(Student student) {
		
		return 0;
	}

}
