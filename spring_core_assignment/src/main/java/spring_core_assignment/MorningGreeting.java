package spring_core_assignment;

import org.springframework.stereotype.Component;
@Component

public class MorningGreeting implements Greeting {
	String greeting="Good Morning";
	public void greet1() {
		System.out.println(greeting);
	}
	public MorningGreeting() {}

	public String greet() {
		return greeting;
	}	

}
