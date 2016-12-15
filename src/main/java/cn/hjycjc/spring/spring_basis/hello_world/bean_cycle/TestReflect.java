package cn.hjycjc.spring.spring_basis.hello_world.bean_cycle;

public class TestReflect {
	public static void main(String[] args) throws Exception{
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式，进行实例化
        class1 = Class.forName("cn.hjycjc.spring.spring_basis.hello_world.bean_cycle.TestReflect");
        class2 = new TestReflect().getClass();
        class3 = TestReflect.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
		
	}

}
