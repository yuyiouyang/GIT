package com.ouyang.demo.dao;

import com.ouyang.demo.entity.Areaentity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaDao {
    List<Areaentity> queryArea();
    AreaDao queryAreaById(int areaId);
    int insertArea(AreaDao areaDao);
    int updateArea(AreaDao areaDao);
    int deleteArea(int areaId);
}
