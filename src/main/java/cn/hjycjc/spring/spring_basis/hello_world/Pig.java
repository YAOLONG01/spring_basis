package cn.hjycjc.spring.spring_basis.hello_world;


public class Pig {
	private String name;
	
	public Pig() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Pig(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void pri(){
		System.out.println("...");
	}
	@Override
	public String toString() {
		return "Pig [name=" + name + "]";
	}
	

}
