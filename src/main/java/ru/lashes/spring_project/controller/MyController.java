package ru.lashes.spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/addNewGirl")
    public String addNewClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "client-info";
    }

    @RequestMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientService.saveClient(client);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateClient(@RequestParam("clntId") int id, Model model) {
        Client client = clientService.getClient(id);
        model.addAttribute("client", client);
        return "client-info";
    }

    @RequestMapping("/deleteClient")
    public String deleteClient(@RequestParam("clntId") int id) {
        clientService.deleteClient(id);
        return "redirect:/";
    }
}
