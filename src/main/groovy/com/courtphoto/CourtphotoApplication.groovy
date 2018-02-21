package com.courtphoto

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.view.InternalResourceViewResolver



@SpringBootApplication
@Configuration
@EnableAutoConfiguration
class CourtphotoApplication {


	static void main(String[] args) {
		SpringApplication.run CourtphotoApplication, args
	}

	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix('/WEB-INF/');
		resolver.setSuffix('.jsp');
		return resolver;
	}

}
