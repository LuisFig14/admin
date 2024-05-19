package com.project.admin.controller.client;

import com.project.admin.domain.client.DataClient;
import com.project.admin.service.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/list")
    public ResponseEntity<List<DataClient>> getClientsByList() {
        return ResponseEntity.ok(clientService.getClientsByList());
    }

    //Get by page
    @GetMapping("/page")
    public ResponseEntity<Page<DataClient>> getClientsByPage(Pageable pageable){
        return ResponseEntity.ok(clientService.getClientsByPage(pageable));
    }






}
