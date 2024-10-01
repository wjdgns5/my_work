package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
	
	 public static void main(String[] args) {
	        SpringApplication application = new SpringApplication(DemoApplication.class);
	        application.setBannerMode(Banner.Mode.CONSOLE); // 배너를 다시 활성화
	        application.run(args);
	    }

}
