package com.web.team3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude={DataSourceAutoConfiguration.class})
public class Kdteam3Application {

	public static void main(String[] args) {
		SpringApplication.run(Kdteam3Application.class, args);
	}

}
