package spring_core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(GreetingService.class);

		
		 //GoodDayGreeting good=context.getBean(GoodDayGreeting.class); good.goodDay();
		//  }
		
	MorningGreeting morning=context.getBean(MorningGreeting.class);
	morning.greet1();
	}
}

