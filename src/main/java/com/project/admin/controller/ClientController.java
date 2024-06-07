package com.project.admin.controller;

import com.project.admin.domain.client.Client;
import com.project.admin.domain.client.ListDataClient;
import com.project.admin.domain.client.RegistrationDataClient;
import com.project.admin.domain.client.UpdateDataClient;
import com.project.admin.service.client.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping()
    public ResponseEntity<List<ListDataClient>> getClientsByList() {
        return ResponseEntity.ok(clientService.getClientsByList());
    }

    //Get by page
    @GetMapping("/page")
    public ResponseEntity<Page<ListDataClient>> getClientsByPage(Pageable pageable){
        return ResponseEntity.ok(clientService.getClientsByPage(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id){
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @PostMapping()
    public ResponseEntity<Client> registerClient(@Valid @RequestBody RegistrationDataClient registrationDataClient){

        Client client = clientService.registerClient(registrationDataClient);

        return new ResponseEntity<>(client , HttpStatus.CREATED);

    }

    @PutMapping
    @Transactional
    public ResponseEntity<?> updateClient(@Valid @RequestBody UpdateDataClient updateDataClient){ //Pending

        Client client = clientService.updateClient(updateDataClient);

        return ResponseEntity.ok(new UpdateDataClient(client.getId(), client.getName(), client.getEmail(), client.getAddress(), client.getPhone()));
    }

    @DeleteMapping("/{id}") //Hacer prueba en insomnia
    @Transactional
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){

        clientService.deleteClient(id);

        return ResponseEntity.noContent().build();

    }





}
