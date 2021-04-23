package basic.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import basic.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate=new JdbcTemplate(getDataSource());
	
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Student VALUES(?,?,?,?)";
        Object[] objects= {student.getId(),student.getName(),student.getBranch(),student.getPhone()};
        int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is:"+ no_rows_inserted);
        
	}

	/*
	 * @Override public void delRecordById(int id) { String delSql =
	 * "DELETE FROM STUDENT WHERE id=?"; int noRecordDeleted =
	 * jdbcTemplate.update(delSql,id); System.out.println(noRecordDeleted);
	 
	}*/
	public DataSource getDataSource() {
		String url ="jdbc:mysql://127.0.0.1:3306/springjdbc";
		String username ="root";
		String password="";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
		return dataSource;
	//	return null;
		
	}

}
