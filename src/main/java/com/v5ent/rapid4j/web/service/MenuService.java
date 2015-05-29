package com.v5ent.rapid4j.web.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.v5ent.rapid4j.core.generic.GenericService;
import com.v5ent.rapid4j.web.model.Menu;
import com.v5ent.rapid4j.web.model.MenuExample;

public interface MenuService extends GenericService<Menu, String> {

	List<Menu> selectByExample(MenuExample example,RowBounds rb);

	List<Menu> selectByAuth(boolean isAuthenicated);

}