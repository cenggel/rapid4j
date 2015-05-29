package com.v5ent.rapid4j.web.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.v5ent.rapid4j.core.generic.GenericService;
import com.v5ent.rapid4j.web.model.Customer;
import com.v5ent.rapid4j.web.model.CustomerExample;

/**
 * Customer业务 接口
 * 
 * @author Mignet
 * @since 2014年7月5日 上午11:53:33
 **/
public interface CustomerService extends GenericService<Customer, String> {

	List<Customer> selectByExample(CustomerExample example,RowBounds rb);

}
