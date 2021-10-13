package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		// ApplicationContext에 2021넌 10월 9일 날자를 가리키는 java.util.Date 빈을 등록하고
		// main에서 찍어보기 toString메서드를 출력해주세용
		// bean의 아이디는 date임.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		/*
		 * String day = context.getBean("dateBean").toString(); String score =
		 * context.getBean("scoreBean").toString(); String beanTest =
		 * context.getBean("beanTest").toString();
		 * 
		 * System.out.println(beanTest);
		 */
		
		
		
	}

}
 