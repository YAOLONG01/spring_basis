package cn.hjycjc.spring.spring_basis.jdbcTemplate;

public class Employees {
	private Integer id;
	
	private Department department;
	private String lastName;
	private String email;
	
	public Employees() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Employees(Integer id, Department department, String lastName, String email) {
		super();
		this.id = id;
		this.department = department;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", department=" + department + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
}
