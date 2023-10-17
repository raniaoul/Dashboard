package com.example.projettableaudebord.Service;
import com.example.projettableaudebord.models.Province;
import java.util.List;

public interface ProvinceService {
    List<Province> getProvinceData();
    Province findById(int id);

}
