package com.example.projettableaudebord.controller;
import com.example.projettableaudebord.Service.ProvinceService;
import com.example.projettableaudebord.models.Province;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ProvinceController {

    private final ProvinceService proservice;


    public ProvinceController(ProvinceService proservice){

        this.proservice = proservice;
    }

    @GetMapping("/Provinces")
    public List<Province> getProvinces()
    {
        return this.proservice.getProvinceData();

    }

    @GetMapping("/Provinces/{id}")
    public Province findById(@PathVariable int id){
        return this.proservice.findById(id);}


}
