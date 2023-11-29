package com.example.clubservice;

import com.example.clubservice.entites.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ClubServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClubServiceApplication.class, args);
    }
@Autowired
	private CandidatRepository repository;


	@Bean
	ApplicationRunner init() {
		return (args) -> {
			repository.save(new Candidat("mariem","ma","ma@esprit.tn"));
			repository.save(new Candidat("sarra","sa","sa@esprit.tn"));
			repository.save(new Candidat("mohamed","mo","mo@esprit.tn"));
			repository.findAll().forEach(System.out::println);
		};
	}
}
