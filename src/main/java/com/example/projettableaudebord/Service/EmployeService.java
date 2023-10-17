package com.example.projettableaudebord.Service;

import com.example.projettableaudebord.models.Employe;

import java.util.List;

public interface EmployeService {
    List<Employe> getEmployeData();

    Employe findById(int id);

    Employe ajouterEmploye(Employe employe);
}
