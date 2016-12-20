package cn.hjycjc.spring.spring_basis.hello_world.bean_cycle;

public class StaticApp {

	public void main(String[] args) {
		int sum = StaticTest.add(1, 2);
		System.out.println(sum);
		StaticTest staticTest =new StaticTest();
		System.out.println(staticTest.add2(1, 2));

	}

}
