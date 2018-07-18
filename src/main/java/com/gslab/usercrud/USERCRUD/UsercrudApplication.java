package com.gslab.usercrud.USERCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations= {"classpath:/config/application-config.xml"})
public class UsercrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsercrudApplication.class, args);
	}
}
