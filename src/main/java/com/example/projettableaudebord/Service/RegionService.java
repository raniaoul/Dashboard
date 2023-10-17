package com.example.projettableaudebord.Service;
import com.example.projettableaudebord.models.Region;
import java.util.List;

public interface RegionService {
    List<Region> getRegionData();
    Region findByCodeRegion(int code);


}
