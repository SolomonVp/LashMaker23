package ru.lashes.spring_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lashes.spring_project.dao.ClientDAO;
import ru.lashes.spring_project.entity.Client;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {


    @Autowired
    private ClientDAO clientDAO;

    @Override
    @Transactional
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Override
    @Transactional
    public void saveClient(Client client) {
        clientDAO.saveClient(client);
    }
}
