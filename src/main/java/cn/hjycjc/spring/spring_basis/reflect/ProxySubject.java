package cn.hjycjc.spring.spring_basis.reflect;

public class ProxySubject implements Subject{
	//代理中必须有真正的实现
	private RealSubject realSubject;
	//构造函数
	//代理角色
	public ProxySubject(RealSubject realSubject) {
		//super();
		this.realSubject = realSubject;
	}
	//实现接口
	@Override
	public void request() {
		// TODO Auto-generated method stub
		 preRequest();
	     realSubject.request();  // 此处执行真实对象的request方法
	     postRequest();
	}
	//之前干的事
	public void preRequest(){
		System.out.println("之前...");
	}
	public void postRequest(){
		System.out.println("之后...");
	}
	//之后干的事
}
