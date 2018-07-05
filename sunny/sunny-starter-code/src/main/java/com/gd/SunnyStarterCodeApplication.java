package com.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2
public class SunnyStarterCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunnyStarterCodeApplication.class, args);
	}
	@RequestMapping("/test")
	public String test(){
		return "Hello ";
	}
}
