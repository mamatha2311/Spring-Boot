package com.example.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
		System.out.println("Welcome to Boot...");
		Alien a = context.getBean(Alien.class);
		a.show();
		Company a2 = context.getBean(Company.class);
		a2.getAlien().show();
	}

}
