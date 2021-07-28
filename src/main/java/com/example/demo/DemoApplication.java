package com.example.demo;

import com.example.demo.beans.SaySomethingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		//SaySomethingService saySomethingService = applicationContext.getBean(SaySomethingService.class);
		//System.out.println(saySomethingService.saySomething());
	}

}
