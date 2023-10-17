package com.example.projettableaudebord.ServiceImpl;
import com.example.projettableaudebord.Repository.ProvinceRepository;
import com.example.projettableaudebord.Service.ProvinceService;
import com.example.projettableaudebord.models.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


 @Service
 public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository proRep;

    @Autowired
    public ProvinceServiceImpl(ProvinceRepository proRep) {
        this.proRep = proRep;
    }

    @Override
    public List<Province> getProvinceData() {
        return (List<Province>) proRep.findAll();
    }

    @Override
    public Province findById(int id){
        return proRep.findById(id).orElse(null);
    }

}
