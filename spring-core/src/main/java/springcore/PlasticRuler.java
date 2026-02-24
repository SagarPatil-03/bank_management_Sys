package springcore;


import org.springframework.stereotype.Component;





@Component


public class PlasticRuler implements Ruler {
	
	
	@Override
	public void measure()
	{
		System.out.println("plastix");
	}

}
