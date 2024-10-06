package hellospringapp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");
		System.out.println("hello");
		Hello obj = (Hello) context.getBean("h");
		System.out.println(obj.getMessage());
		System.out.println(obj.getName());
	}

}
