package com.Alvaro.SpringAprendendo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController// faz com que está classe um endpoint
public class SpringAprendendoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAprendendoApplication.class, args);

	}

}



