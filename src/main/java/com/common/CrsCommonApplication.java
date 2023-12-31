package com.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages={"com.common"})public class CrsCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsCommonApplication.class, args);
	}

}
