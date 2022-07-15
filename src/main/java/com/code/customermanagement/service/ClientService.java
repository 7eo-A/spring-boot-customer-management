package com.code.customermanagement.service;

import com.code.customermanagement.dto.ClientDTO;
import com.code.customermanagement.entity.City;
import com.code.customermanagement.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    Client getById(Integer id);
    Client save(ClientDTO clientDTO);
    void delete(Integer id);
    Client update(ClientDTO clientDTO);

}
