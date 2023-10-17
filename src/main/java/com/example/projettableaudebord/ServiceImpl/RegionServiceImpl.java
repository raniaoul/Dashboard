package com.example.projettableaudebord.ServiceImpl;
import com.example.projettableaudebord.Repository.RegionRepository;
import com.example.projettableaudebord.Service.RegionService;
import com.example.projettableaudebord.models.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regRep;

    @Autowired
    public RegionServiceImpl(RegionRepository regRep) {
        this.regRep = regRep;
    }

    @Override
    public List<Region> getRegionData() {
        return (List<Region>) regRep.findAll();
    }

    @Override
    public Region findByCodeRegion(int code){
        return regRep.findById(code).orElse(null);
    }
}
