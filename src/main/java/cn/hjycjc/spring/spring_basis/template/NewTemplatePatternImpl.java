package cn.hjycjc.spring.spring_basis.template;

public class NewTemplatePatternImpl extends TemplatePattern {

	@Override
	protected void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3()在子类NewTemplatePatternImpl中实现了！");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		//super.method2();
		System.out.println("子类NewTemplatePatternImpl覆盖了父类的method2()方法！！");
	}
	

}
