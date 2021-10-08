package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("test01/ApplicationContext.xml");
		// 스프링이 관리하는 bean에 인스턴스가 올라감! 여기까지만 쓰고 실행해도!
		
		Address adr = (Address) context.getBean("parameter");
		Address set = context.getBean("setter", Address.class);
		Address adrIdx = context.getBean("parameterWithIndex", Address.class);
		System.out.println(adrIdx); 
	}

}
