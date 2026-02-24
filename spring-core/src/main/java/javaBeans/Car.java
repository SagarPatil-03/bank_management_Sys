package javaBeans;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("my_car")
@PropertySource("classpath:car.properties")
public class Car {

//	@Setter(AccessLevel.NONE)
	
	@Autowired
	private Engine engine;
	
	//setter Injection
	// we must call this setter to do DI using setter.
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
//	
	//Constructor Injection...
	public Car(Engine engine)
	{
		this.engine=engine;
	}
    private String model;
    private String brand;

    @Value("${car.tyres}")
    private List<String> tyres;

    @Value("#{${car.priceRange}}")
    private Map<String, String> priceRange;

    public void run() {
        System.out.println("car is running");
    }

	
}
