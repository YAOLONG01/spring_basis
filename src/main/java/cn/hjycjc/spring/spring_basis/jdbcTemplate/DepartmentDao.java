package cn.hjycjc.spring.spring_basis.jdbcTemplate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
@Component
public class DepartmentDao extends JdbcDaoSupport{
	//不经常使用

	
	//由于SetDataSource()是final,不能被重写,所以只能xml配置，想注解只有变法
	@Autowired
	public void setDataSource2(DataSource dataSource){
		setDataSource(dataSource);
		
	}
	
	public Department get(Integer id){
		String sql ="SELECT ID, NAME FROM department WHERE ID=?";
		RowMapper<Department> rowMapper = new BeanPropertyRowMapper<>(Department.class);
		Department department=getJdbcTemplate().queryForObject(sql, rowMapper,id);
		return department;
	}

}
