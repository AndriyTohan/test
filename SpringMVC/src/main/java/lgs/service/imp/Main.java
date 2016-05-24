package lgs.service.imp;

import lgs.service.BookS;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/appContext.xml");
		
		BookS bookS = applicationContext.getBean(BookS.class);
		bookS.save("bukvar");
		
		applicationContext.close();
		
		
		
	}

}
