package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com")
@EntityScan(basePackages = "com")
public class SpringBootRestSectioEnd2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestSectioEnd2Application.class, args);
	}

}
