package Assignment2;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class EmployeeImpl implements EmployeeInterface {
private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO EMP_TABLE VALUES(?,?,?)";
        Object[] objects= {employee.getId(),employee.getName(),employee.getLocation()};
        int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is:"+ no_rows_inserted);
        
	}
	public DataSource getDataSource() {
		String url ="jdbc:mysql://127.0.0.1:3306/emp_database";
		String username ="root";
		String password="";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
		return dataSource;
	}

}
