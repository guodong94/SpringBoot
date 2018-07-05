package com.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SunnyStarterCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunnyStarterCacheApplication.class, args);
	}
	@RequestMapping("/test")
	public String test(){
		return "Hello World";
	}
}
