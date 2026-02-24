package Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfic;

import springcore.Demmo;

public class DemmoDriver {
	
	public static void main(String args[])
	{
	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfic.class);
	 
	 
      Demmo d = context.getBean(Demmo.class);
	     
      
      // prints same references if scope is singleton. 
      
      // prints different references if scope is prototype
    System.out.println(context.getBean(Demmo.class));
    
    
	}
	 
	
}
