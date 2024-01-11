package com.Moriarty.backend;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.provisioning.UserDetailsManager;


@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		
	}
	
//	@Bean
//	CommandLineRunner commandLineRunner(UserDetailsManager fakeRepo) {
//		return args -> {
//			
//			User result = (User) fakeRepo.loadUserByUsername("james");
//			System.out.println(result.getName() + ": " + result.getPassword());
//		};
//	}

	
//	@Bean
//	CommandLineRunner commandLineRunner(FakeProductRepository fakeRepo) {
//		return args -> {
//			fakeRepo.deleteAll();
//			
//			FakeProduct obj = new FakeProduct("test");
//			fakeRepo.save(obj);
//			
//			List<FakeProduct> result = fakeRepo.findAll();
//			for (FakeProduct i : result) {
//				System.out.println(i.getTitle() + ": " + i.getFakeProduct_uuid());
//			}
//		};
//	}

}
