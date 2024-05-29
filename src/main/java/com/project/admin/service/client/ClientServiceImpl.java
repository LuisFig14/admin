package com.project.admin.service.client;

import com.project.admin.domain.client.Client;
import com.project.admin.domain.client.ListDataClient;
import com.project.admin.domain.client.RegistrationDataClient;
import com.project.admin.domain.client.UpdateDataClient;
import com.project.admin.repository.client.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ListDataClient> getClientsByList() {
        return clientRepository.findAll().stream().map(ListDataClient::new).toList();
    }

    @Override
    public Page<ListDataClient> getClientsByPage(Pageable pageable) {
        return clientRepository.findAll(pageable).map(ListDataClient::new);
    }

    @Override
    public ListDataClient getClientById(Long id) {

        Optional<Client> client = clientRepository.findById(id);

        if(client.isPresent()){
            return new ListDataClient(client.get());
        }else{
            throw new RuntimeException("Client not found " + id);
        }

    }

    @Override
    public Client registerClient(RegistrationDataClient registrationDataClient){

        Client client = new Client();
        client.setName(registrationDataClient.name());
        client.setEmail(registrationDataClient.email());
        client.setAddress(registrationDataClient.address());
        client.setPhone(registrationDataClient.phone());

        return clientRepository.save(client);

    }

    @Override
    public Client updateClient(UpdateDataClient updateDataClient) {

        Client client = clientRepository.getReferenceById(updateDataClient.id());
        client.updateClientEntity(updateDataClient);
        return client;

    }

}
