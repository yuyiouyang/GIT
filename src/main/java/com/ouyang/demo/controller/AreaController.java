package com.ouyang.demo.controller;

import com.ouyang.demo.entity.Areaentity;
import com.ouyang.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/listArea")
    public Map<String,Object> getAllArea(){
        Map<String,Object> modelMap = new HashMap<>();
        List<Areaentity> list = areaService.queryArea();
        modelMap.put("areaList:",list);
        return modelMap;
    }
}
