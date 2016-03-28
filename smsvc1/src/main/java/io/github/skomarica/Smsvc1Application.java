package io.github.skomarica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.skomarica.security.UserService;
import io.github.skomarica.security.UserServiceImpl;

@SpringBootApplication
public class Smsvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Smsvc1Application.class, args);
	}

	@Bean
	public UserService getUserService() {
		return new UserServiceImpl();
	}
}
