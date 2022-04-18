package com.example.MultiplexProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.model,com.dao,com.controller"})
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")
public class MultiplexProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexProjectApplication.class, args);
	}

}
