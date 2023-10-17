package com.example.projettableaudebord.Service;

import com.example.projettableaudebord.models.Commune;

import java.util.List;



public interface CommuneService {
    List<Commune> getCommuneData();

    Commune findById(int id);
}
