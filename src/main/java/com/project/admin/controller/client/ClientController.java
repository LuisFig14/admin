package com.project.admin.controller.client;

import com.project.admin.domain.client.Client;
import com.project.admin.domain.client.DataClient;
import com.project.admin.repository.client.ClientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @PostMapping
    public void saveClient(@RequestBody @Valid DataClient dataClient){
        clientRepository.save(new Client(dataClient));
    }




}
