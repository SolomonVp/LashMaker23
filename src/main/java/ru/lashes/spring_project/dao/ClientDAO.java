package ru.lashes.spring_project.dao;

import ru.lashes.spring_project.entity.Client;

import java.util.List;

public interface ClientDAO {
    public List<Client> getAllClients();

    public void saveClient(Client client);
}
