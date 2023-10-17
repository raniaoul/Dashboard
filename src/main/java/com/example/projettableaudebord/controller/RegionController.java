package com.example.projettableaudebord.controller;
import com.example.projettableaudebord.Service.RegionService;
import com.example.projettableaudebord.models.Region;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@CrossOrigin("*")
    public class RegionController {

        private final RegionService regservice;


        public RegionController(RegionService regservice) {
            this.regservice = regservice;
        }




        @GetMapping("/Regions")
        public List<Region> getRegions()
        {
            return this.regservice.getRegionData();

        }



    @GetMapping("/Regions/{code}")
    public Region findByCodeRegion(@PathVariable int code){
        return this.regservice.findByCodeRegion(code);}


}

