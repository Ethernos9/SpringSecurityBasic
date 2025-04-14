package com.example.SpringSecureApp;

import com.example.SpringSecureApp.model.User;
import com.example.SpringSecureApp.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecureAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecureAppApplication.class, args);
	}




	@Bean
	CommandLineRunner init(UserRepo userRepo){
		return args ->{
			if (userRepo.count() == 0){
				userRepo.save(new User("elon","spacex"));
				userRepo.save(new User("shubhm","ethernos@09"));
				userRepo.save(new User("admin","ethernos"));
			}
		};
	}
}
