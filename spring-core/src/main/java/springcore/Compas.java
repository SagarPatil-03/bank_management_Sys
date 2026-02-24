package springcore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class Compas {
	
	
	@Autowired
	@Qualifier("plasticRuler")
	
	private Ruler ruler;

}
