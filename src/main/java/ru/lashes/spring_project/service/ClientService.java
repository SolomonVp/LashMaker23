package ru.lashes.spring_project.service;

import ru.lashes.spring_project.entity.Client;

import java.util.List;

public interface ClientService {
    public List<Client> getAllClients();
    public void saveClient(Client client);

}
