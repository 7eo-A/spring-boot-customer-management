package com.code.customermanagement.controller;

import com.code.customermanagement.dto.ClientDTO;
import com.code.customermanagement.entity.City;
import com.code.customermanagement.entity.Client;
import com.code.customermanagement.service.CityService;
import com.code.customermanagement.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/views/client")
public class ClientController {
    private final ClientService clientService;
    private final CityService cityService;

    public ClientController(ClientService clientService, CityService cityService) {
        this.clientService = clientService;
        this.cityService = cityService;
    }

    @GetMapping("/")
    public String findAll(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clientList", clients);
        return "/views/client/list";
    }

    @GetMapping("/register")
    public String form(Model model) {
        // list of cities
        List<City> cities = cityService.getAllCities();
        model.addAttribute("clientDTO", new ClientDTO());
        model.addAttribute("cityList", cities);
        return "/views/client/form";
    }

    @PostMapping("/save")
    public String saveClient(@ModelAttribute ClientDTO clientDTO) {
        // save client from DTO
        clientService.save(clientDTO);
        return "redirect:/views/client/";
    }

    @GetMapping("/edit")
    public String editClient(@RequestParam Integer id, Model model) {
        // find the client
        Client tmp = clientService.getById(id);
        // list of cities
        List<City> cities = cityService.getAllCities();
        model.addAttribute("clientDTO", tmp);
        model.addAttribute("cityList", cities);
        return "/views/client/form";
    }

    @GetMapping("/delete")
    public String deleteClient(@RequestParam Integer id) {
        clientService.delete(id);
        return "redirect:/views/client/";
    }

}
