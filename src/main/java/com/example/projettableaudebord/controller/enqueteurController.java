package com.example.projettableaudebord.controller;
import com.example.projettableaudebord.Repository.EnqueteurRepository;
import com.example.projettableaudebord.Service.EnqueteurService;
import com.example.projettableaudebord.models.Enqueteur;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class enqueteurController {


    private final EnqueteurService enqservice;
    private final EnqueteurRepository enqRep;


    public enqueteurController(EnqueteurService enqservice, EnqueteurRepository enqRep){
        this.enqservice = enqservice;
        this.enqRep = enqRep;
    }



    @GetMapping("/Enqueteurs")
    public Iterable<Enqueteur> getEnqueteurs()
    {
       return this.enqRep.findAll();

    }


   @GetMapping("/Enqueteurs/{id}")
    public Enqueteur getEnqueteur(@PathVariable int id){
        return this.enqservice.findById(id);
        }

}
