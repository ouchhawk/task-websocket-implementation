package com.example.demo.controllers;

import com.example.demo.models.dtos.RegistryDTO;
import com.example.demo.services.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/registry")
public class RegistryController {

    private final RegistryService registryService;

    @Autowired
    public RegistryController(RegistryService registryService) {
        this.registryService = registryService;
    }

    @GetMapping
    public List<RegistryDTO> getRegistries() {
        return registryService.getRegistries();
    }
}