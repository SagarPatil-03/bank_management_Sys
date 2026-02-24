package Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.Demo;

public class demoDriver {
	
	public static void main(String args[])
	{
		ApplicationContext c= new ClassPathXmlApplicationContext("config.xml");
		Demo d= c.getBean( Demo.class);
		d.m1();
		
	}

}
