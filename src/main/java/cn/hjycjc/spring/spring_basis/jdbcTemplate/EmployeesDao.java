package cn.hjycjc.spring.spring_basis.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeesDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Employees get(Integer id){
		String sql ="SELECT ID,LAST_NAME,EMAIL FROM employees WHERE ID=?";
		RowMapper<Employees> rowMapper = new BeanPropertyRowMapper<>(Employees.class);
		Employees employees=jdbcTemplate.queryForObject(sql, rowMapper,id);
		return employees;
	}

}
