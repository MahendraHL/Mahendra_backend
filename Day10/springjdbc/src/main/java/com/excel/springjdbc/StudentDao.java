package com.excel.springjdbc;

import java.util.List;
import java.util.Map;

public interface StudentDao {

	int insert(Student student);

	int updateData(Student student);
	
	int delete(Student student);
	
	int selectOneRecord(Student student);
	
	public List<Map<String, Object>> select(Student student);


}
