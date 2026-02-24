package springcore;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Primary //beaned to specify the primary qualifying in bean is case only one . 
@Component
public class SteelRuler implements Ruler {
	
	@Override
	public void measure() {
		System.out.println("steelRuler from measure");
		
	}
	

}
