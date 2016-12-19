package cn.hjycjc.spring.spring_basis.template;

public class App {
	public static void main(String[] args) {
		TemplatePattern templatePattern =new TemplatePatternImpl();
		templatePattern.templateMethod();
		System.out.println("************************");
		
		TemplatePattern templatePattern2 =new NewTemplatePatternImpl();
		templatePattern2.templateMethod();
				
	}
}
