package com.ouyang.demo.service.impl;

import com.ouyang.demo.dao.AreaDao;
import com.ouyang.demo.entity.Areaentity;
import com.ouyang.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
   @Autowired
   private AreaDao areaDao;

    @Override
    public List<Areaentity> queryArea() {
        return areaDao.queryArea();
    }
}
