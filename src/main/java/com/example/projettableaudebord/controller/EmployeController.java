package com.example.projettableaudebord.controller;
import com.example.projettableaudebord.Repository.EmployeRepository;
import com.example.projettableaudebord.Service.EmployeService;
import com.example.projettableaudebord.models.Employe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class EmployeController {

    private final EmployeService empservice;


    public EmployeController(EmployeService empservice) {
        this.empservice = empservice;

    }

    @GetMapping("/Employes")
    public List<Employe> getEmployes() {
        return this.empservice.getEmployeData();
    }

    @GetMapping("/Employes/{id}")
    public Employe findById(@PathVariable int id) {
        return this.empservice.findById(id);
    }

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(Employe employe) {
       return empservice.ajouterEmploye(employe);

    }
}
