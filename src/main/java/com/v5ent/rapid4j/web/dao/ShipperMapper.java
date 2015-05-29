package com.v5ent.rapid4j.web.dao;

import com.v5ent.rapid4j.web.model.Shipper;
import com.v5ent.rapid4j.web.model.ShipperExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ShipperMapper {
    int countByExample(ShipperExample example);

    int deleteByExample(ShipperExample example);

    int deleteByPrimaryKey(String shipperid);

    int insert(Shipper record);

    int insertSelective(Shipper record);

    List<Shipper> selectByExample(ShipperExample example);

    Shipper selectByPrimaryKey(String shipperid);

    int updateByExampleSelective(@Param("record") Shipper record, @Param("example") ShipperExample example);

    int updateByExample(@Param("record") Shipper record, @Param("example") ShipperExample example);

    int updateByPrimaryKeySelective(Shipper record);

    int updateByPrimaryKey(Shipper record);
}