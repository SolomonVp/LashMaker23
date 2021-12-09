package ru.lashes.spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lashes.spring_project.dao.ClientDAO;
import ru.lashes.spring_project.entity.Client;
import ru.lashes.spring_project.service.ClientService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String showAllClients(Model model) {
        List<Client> allClients = clientService.getAllClients();
        model.addAttribute("allClnts", allClients);
        return "all-clients";
    }
}
