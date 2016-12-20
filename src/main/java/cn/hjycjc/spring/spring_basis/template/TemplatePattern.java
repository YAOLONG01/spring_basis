package cn.hjycjc.spring.spring_basis.template;


public abstract class TemplatePattern {
	//模板方法，父类中定义算法的主要流程，有着整个流程的主动权，所以设置为final不希望子类更改
	public final void templateMethod(){
		method1();
		method2();//勾子方法；父类提供默认实现，如果子类觉得有必要定制，则可以覆盖父类的默认实现。
		method3();//抽象方法
	}
	private void method1(){
		System.out.println("父类实现业务逻辑!");
	}
	
	public void method2(){
		System.out.println("父类默认实现，子类可覆盖");
	}
	protected abstract void method3();//子类负责实现业务逻辑
}
