package com.v5ent.rapid4j.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.v5ent.rapid4j.core.generic.GenericDao;
import com.v5ent.rapid4j.core.generic.GenericServiceImpl;
import com.v5ent.rapid4j.web.dao.MenuMapper;
import com.v5ent.rapid4j.web.model.Menu;
import com.v5ent.rapid4j.web.model.MenuExample;
import com.v5ent.rapid4j.web.service.MenuService;

/**
 * 用户Service实现类
 *
 * @author Mignet
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class MenuServiceImpl extends GenericServiceImpl<Menu, String> implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public int insert(Menu model) {
        return menuMapper.insertSelective(model);
    }

    @Override
    public int update(Menu model) {
        return menuMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(String id) {
        return menuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Menu selectById(String id) {
        return menuMapper.selectByPrimaryKey(id);
    }

	@Override
	public GenericDao<Menu, String> getDao() {
		return menuMapper;
	}

	@Override
	public List<Menu> selectByExample(MenuExample example,RowBounds rb) {
		return menuMapper.selectByExample(example,rb);
	}

	@Override
	public List<Menu> selectByAuth(boolean isAuthenicated) {
		MenuExample e = new MenuExample();
		e.createCriteria().andRequiresauthenicationEqualTo(isAuthenicated);
		return menuMapper.selectByExample(e);
	}

}
