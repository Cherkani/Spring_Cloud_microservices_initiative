package com.example.voiture;

import com.example.voiture.entities.Client;
import com.example.voiture.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Cherkani Aymen ", Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"), "Bennane Ilyass", Float.parseFloat("272")));
            clientRepository.save(new Client(Long.parseLong("3"), "Mninou Nassim", Float.parseFloat("49")));
            clientRepository.save(new Client(Long.parseLong("4"), "Errasekh Youssef", Float.parseFloat("63")));

        };
    }



}




