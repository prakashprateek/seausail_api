package com.berriesoft.seausail_api;

import com.berriesoft.seausail_api.auth.AuthenticationService;
import com.berriesoft.seausail_api.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.berriesoft.seausail_api.user.Role.ADMIN;
import static com.berriesoft.seausail_api.user.Role.MANAGER;

@SpringBootApplication
public class SeaUSailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeaUSailApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService authenticationService
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + authenticationService.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstname("Manager")
					.lastname("Manager")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + authenticationService.register(manager).getAccessToken());

		};
	}
}
