package ru.bachar.piwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class PiWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiWebApiApplication.class, args);
	}

	@Bean
	CharacterEncodingFilter characterEncodingFilter() {
    CharacterEncodingFilter filter = new CharacterEncodingFilter();
    filter.setEncoding("UTF-8");
    filter.setForceEncoding(true);
    return filter;
	}
}