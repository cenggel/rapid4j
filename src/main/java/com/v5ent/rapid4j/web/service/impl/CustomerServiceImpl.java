package com.v5ent.rapid4j.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.v5ent.rapid4j.core.generic.GenericDao;
import com.v5ent.rapid4j.core.generic.GenericServiceImpl;
import com.v5ent.rapid4j.web.dao.CustomerMapper;
import com.v5ent.rapid4j.web.model.Customer;
import com.v5ent.rapid4j.web.model.CustomerExample;
import com.v5ent.rapid4j.web.service.CustomerService;

/**
 * 用户Service实现类
 *
 * @author Mignet
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class CustomerServiceImpl extends GenericServiceImpl<Customer, String> implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public int insert(Customer model) {
        return customerMapper.insertSelective(model);
    }

    @Override
    public int update(Customer model) {
        return customerMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(String id) {
        return customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Customer selectById(String id) {
        return customerMapper.selectByPrimaryKey(id);
    }

	@Override
	public GenericDao<Customer, String> getDao() {
		return customerMapper;
	}

	@Override
	public List<Customer> selectByExample(CustomerExample example,RowBounds rb) {
		return customerMapper.selectByExample(example,rb);
	}

}
