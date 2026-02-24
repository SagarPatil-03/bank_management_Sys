package javaBeans;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Engine {
	private double cc;
	private String type;

}
