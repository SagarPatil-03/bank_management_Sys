package Driver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfic;
import javaBeans.Bike;
import javaBeans.Car;

public class CarDriver{
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfic.class);
				
				Car c= context.getBean(Car.class);
				c.run();
//				System.out.println(c.getModel());
//				System.out.println(c.getPriceRange());
//				System.out.println(c.getTyres());
//				System.out.println(c.getBrand());
				System.out.println(c.getEngine().getCc());
				
				
//				Bike b =context.getBean(Bike.class);
//				b.ride();
				
		
	}

}
