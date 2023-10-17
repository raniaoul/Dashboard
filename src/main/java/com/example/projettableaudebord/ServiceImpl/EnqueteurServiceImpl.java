package com.example.projettableaudebord.ServiceImpl;
import com.example.projettableaudebord.Repository.EnqueteurRepository;
import com.example.projettableaudebord.Service.EnqueteurService;
import com.example.projettableaudebord.models.Enqueteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnqueteurServiceImpl implements EnqueteurService {

    private final EnqueteurRepository enqRep;

    @Autowired
    public EnqueteurServiceImpl(EnqueteurRepository enqRep) {
        this.enqRep = enqRep;
    }





       @Override
    public Enqueteur findById(int id) {
        return enqRep.findById(id).orElse(null);
    }

}

