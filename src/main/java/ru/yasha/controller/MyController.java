package ru.yasha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.yasha.repository.AddressRepository;
import ru.yasha.entity.Address;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    AddressRepository repository;

    @GetMapping("/address/raz")
    public Address getAddressName() {
        return repository.findByName("Raz");
    }

    @GetMapping("/address")
    public List<Address> getAddress() {
        return repository.findAll();
    }

}
