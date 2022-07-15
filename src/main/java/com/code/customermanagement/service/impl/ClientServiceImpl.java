package com.code.customermanagement.service.impl;

import com.code.customermanagement.dto.ClientDTO;
import com.code.customermanagement.entity.Client;
import com.code.customermanagement.exception.ResourceNotFoundException;
import com.code.customermanagement.repository.ClientRepository;
import com.code.customermanagement.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getById(Integer id) {
        Client tmp;
        Optional<Client> optionalClient = clientRepository.findById(id);

        if (optionalClient.isPresent()) {
            tmp = optionalClient.get();
        } else {
            throw new ResourceNotFoundException("Client", "ID", id);
        }
        return tmp;
    }

    @Override
    public Client save(ClientDTO clientDTO) {
        // save client from client DTO
        Client tmp = new Client(clientDTO.getFirstName(), clientDTO.getLastName(), clientDTO.getPhoneNumber(),
                clientDTO.getEmail(), clientDTO.getCity());
        return clientRepository.save(tmp);
    }

    @Override
    public void delete(Integer id) {
        // check whether user exist in the database
        if (clientRepository.findById(id).isPresent()) {
            clientRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Client", "ID", id);
        }
    }

    @Override
    public Client update(ClientDTO clientDTO) {
        return null;
    }

}
