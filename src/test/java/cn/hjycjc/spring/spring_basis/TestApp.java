package cn.hjycjc.spring.spring_basis;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import cn.hjycjc.spring.spring_basis.jdbcTemplate.Department;
import cn.hjycjc.spring.spring_basis.jdbcTemplate.DepartmentDao;
import cn.hjycjc.spring.spring_basis.jdbcTemplate.Employees;
import cn.hjycjc.spring.spring_basis.jdbcTemplate.EmployeesDao;

public class TestApp {
	
	private	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_jdbcTemplate_dbProperties.xml");
	
	private JdbcTemplate jdbcTemplate =(JdbcTemplate) ctx.getBean("jdbcTemplate");

	private Employees employees=null;
	
	private EmployeesDao employeesDao = (cn.hjycjc.spring.spring_basis.jdbcTemplate.EmployeesDao) ctx.getBean("employeesDao");
	
	private Department department=null;
	
	private DepartmentDao departmentDao =ctx.getBean(DepartmentDao.class);
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate=ctx.getBean(NamedParameterJdbcTemplate.class);
	//测试能否连接数据库
	@Test
	//注意抛出错误，两种方式解决
	public void testDataSource() throws SQLException{
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
	//JdbcTemplate的update(sql,args);
	//更新一条记录
	@Test
	public void testJdbcTemplateUpdate(){
		//sql可以是INSERT、UPDATE、DELECT
		String sql="UPDATE employees SET LAST_NAME=? WHERE ID=?";
				
		jdbcTemplate.update(sql, "yaolong",3);
	}
	/*JdbcTemplate的
	 * batchUpdate(sql, batchArgs)*/
	//批量插入
//	@Test
//	public void testJdbcTemplateBatchUpdate(){
//		//sql可以是INSERT、UPDATE、DELECT
//		String sql="INSERT INTO employees(LAST_NAME,EMAIL,DEPT_ID) VALUES(?,?,?)";
//		//注意
//		List<Object[]> batchArgs =new ArrayList<>();
//		//注意是object
//		batchArgs.add(new Object[]{"AA","aa@hjycjc.cn",2});
//		batchArgs.add(new Object[]{"BB","bb@hjycjc.cn",2});
//		batchArgs.add(new Object[]{"CC","cc@hjycjc.cn",2});
//		batchArgs.add(new Object[]{"DD","dd@hjycjc.cn",2});
//		batchArgs.add(new Object[]{"EE","ee@hjycjc.cn",2});
//		jdbcTemplate.batchUpdate(sql, batchArgs);
//	}
	//jdbcTemplate.queryForObject(sql, rowMapper);注意和jdbcTemplate.queryForObject(sql, requiredType)的区别
	//获取一个对象
	@Test
	public void testJdbcTemplateQueryForOject(){
		//SELECT 
		String sql ="SELECT ID,LAST_NAME,EMAIL FROM employees WHERE ID=?";
		RowMapper<Employees> rowMapper = new BeanPropertyRowMapper<>(Employees.class);
		employees=jdbcTemplate.queryForObject(sql, rowMapper,1);
		System.out.println(employees);
	}
	
	//jdbcTemplate.query(sql, rowMapper)
	//查询获得一组类
	@Test
	public void testJdbcTemplateQuery(){
		String sql ="SELECT ID,LAST_NAME,EMAIL FROM employees WHERE ID > ?";
		RowMapper<Employees> rowMapper = new BeanPropertyRowMapper<>(Employees.class);
		List<Employees> listEmployees=jdbcTemplate.query(sql, rowMapper,8);
		System.out.println(listEmployees);
	}
	
	//jdbcTemplate.queryForObject(sql, requiredType);
	//统计查询或某个字段
	@Test
	public void testJdbcTemplateQueryForOject2(){
		//统计查询count()
		String sql="SELECT count(id) FROM employees";
		
		Long count =jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(count);
		//count可以做事物，现在用Spring提供的事物管理解决
		
	}
	@Test
	public void testJdbcTemplateQueryForOject3(){
		//查询某个字段
		String sql="SELECT EMAIL FROM employees WHERE ID=?";
		
		String email =jdbcTemplate.queryForObject(sql, String.class,1);
		System.out.println(email);
		
	}
	//具体用法，DAO
	@Test
	public void testEmployees(){
		
		System.out.println("testEmployess: "+employeesDao.get(2));
		
	}
	@Test
	public void testDepartment(){
		
		System.out.println("testEmployess: "+departmentDao.get(1));
		
	}
	
/*	@Test
	public void testNamedParameterJdbcTemplate(){
		String sql ="INSERT INTO employees(LAST_NAME,EMAIL,DEPT_ID) VALUES(:lastName,:email,:dept_id)";
		
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("lastName", "FF");
		
		paramMap.put("email", "ff@hjycjc.com");
		
		paramMap.put("dept_id", "1");
		
		namedParameterJdbcTemplate.update(sql, paramMap);
		
	}*/
	
	@Test
	public void testNamedParameterJdbcTemplate2(){
		String sql ="INSERT INTO department(NAME) VALUES(:Name)";
		Department department2 =new Department();
		department2.setName("运维部");
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(department2);
		namedParameterJdbcTemplate.update(sql, paramSource);
	}
	
}
