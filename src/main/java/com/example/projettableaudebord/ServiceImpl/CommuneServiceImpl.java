package com.example.projettableaudebord.ServiceImpl;
import com.example.projettableaudebord.Repository.CommuneRepository;
import com.example.projettableaudebord.Service.CommuneService;
import com.example.projettableaudebord.models.Commune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CommuneServiceImpl implements CommuneService {


    private final CommuneRepository comRep;

    @Autowired
    public CommuneServiceImpl(CommuneRepository comRep) {
        this.comRep = comRep;
    }


    @Override
    public List<Commune> getCommuneData() {
        return (List<Commune>) comRep.findAll();
    }

    @Override
    public Commune findById(int id){
          return comRep.findById(id).orElse(null);
    }

}

