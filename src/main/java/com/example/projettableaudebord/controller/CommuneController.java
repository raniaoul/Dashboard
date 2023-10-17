package com.example.projettableaudebord.controller;
import com.example.projettableaudebord.Service.CommuneService;
import com.example.projettableaudebord.models.Commune;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@CrossOrigin("*")
public class CommuneController {

    private final CommuneService comservice;

    public CommuneController(CommuneService comservice) {
        this.comservice = comservice;
    }

    @GetMapping("/Communes")
    public List<Commune> getCommunes()
    {
        return this.comservice.getCommuneData();

    }

    @GetMapping("/Communes/{id}")
    public Commune findById(@PathVariable int id){
        return this.comservice.findById(id);}


}
