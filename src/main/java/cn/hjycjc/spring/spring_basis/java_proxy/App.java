package cn.hjycjc.spring.spring_basis.java_proxy;

public class App {
	public static void main(String[] args) {
		ArithmeticCalculator arithmeticCalculator=new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(arithmeticCalculator).getLoggingProxy();
		System.out.println(proxy.add(1, 2));
		System.out.println(proxy.sub(2, 1));
		System.out.println(proxy.mul(3, 4));
		System.out.println(proxy.div(5, 4));
	}

}
