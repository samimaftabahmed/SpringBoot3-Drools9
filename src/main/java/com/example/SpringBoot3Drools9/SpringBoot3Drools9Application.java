package com.example.SpringBoot3Drools9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.sam.springdroolspersistence.entity", "org.drools.persistence.info"})
@EnableJpaRepositories
@SpringBootApplication
public class SpringBoot3Drools9Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3Drools9Application.class, args);
	}

}
