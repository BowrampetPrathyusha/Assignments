package spring_core_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class GoodDayGreeting implements Greeting{
	@Autowired
	@Qualifier("morningGreeting")
	Greeting gre;
	public Greeting getGre() {
		return gre;
	}
	public void setGre(Greeting gre) {
		this.gre = gre;
	}
	String greeting="Have a Good Day";
	
	public void goodDay() {
		
		System.out.println(greeting);
		gre.greet();
		}


	


	public GoodDayGreeting() {
	}
	public String greet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
 

	 
	
}
    
