package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;

import springcore.Demmo;

@Configuration
@ComponentScan(basePackages = {"springcore"})
//@ComponentScan(basePackageClasses = {Car.class)
public class AppConfic {
	
	@Scope("prototype")
	@Bean
	public Demmo getDemo()
	{
		return new Demmo();
	}
	
	

}
