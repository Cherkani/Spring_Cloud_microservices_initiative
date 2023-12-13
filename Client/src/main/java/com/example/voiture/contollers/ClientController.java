package com.example.voiture.contollers;


import com.example.voiture.entities.Client;
import com.example.voiture.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> findAll(){
        return clientRepository.findAll();
    }


    @GetMapping("/client/{id}")
    public Client findById(@PathVariable Integer id) throws Exception {
        return clientRepository.findById(id.longValue()).orElseThrow(()-> new Exception("Client not found"));
    }



}