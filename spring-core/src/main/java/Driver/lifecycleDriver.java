package Driver;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.BeanLifeCycle;

public class lifecycleDriver {
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		BeanLifeCycle c1 =  con.getBean(BeanLifeCycle.class);
		
		
	}

}
