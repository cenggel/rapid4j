package com.v5ent.rapid4j.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.v5ent.rapid4j.core.generic.GenericDao;
import com.v5ent.rapid4j.web.model.Customer;
import com.v5ent.rapid4j.web.model.CustomerExample;

public interface CustomerMapper extends GenericDao<Customer, String>{
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String customerid);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example,RowBounds rb);

    Customer selectByPrimaryKey(String customerid);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}