package Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfic;
import springcore.Compas;
import springcore.SteelRuler;

public class compasDriver {
	public static void main(String[] args) {
		 
				 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfic.class);
				 
				 Compas c = context.getBean(Compas.class);
				 c.getRuler().measure();
				 
					
	}

}
