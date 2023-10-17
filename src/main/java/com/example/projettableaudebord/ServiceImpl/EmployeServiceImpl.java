package com.example.projettableaudebord.ServiceImpl;
import com.example.projettableaudebord.Repository.EmployeRepository;
import com.example.projettableaudebord.Service.EmployeService;
import com.example.projettableaudebord.models.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeServiceImpl implements EmployeService {


        private final EmployeRepository empRep;

    @Autowired
    public EmployeServiceImpl(EmployeRepository empRep) {
        this.empRep = empRep;
    }

    @Override
        public List<Employe> getEmployeData() {
            return (List<Employe>) empRep.findAll();
        }

        @Override
        public Employe findById(int id){
            return empRep.findById(id).orElse(null);
        }

       @Override
    public Employe ajouterEmploye(Employe employe) {
        return empRep.save(employe);
    }
}


