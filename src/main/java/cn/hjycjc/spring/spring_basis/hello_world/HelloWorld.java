package cn.hjycjc.spring.spring_basis.hello_world;

public class HelloWorld {
	//name属性
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//hello()方法
	public void hello(){
		System.out.println("hello:"+name);
	}

	public HelloWorld() {

	}
	
}
