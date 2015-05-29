package com.v5ent.rapid4j.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.v5ent.rapid4j.core.generic.GenericDao;
import com.v5ent.rapid4j.web.model.Menu;
import com.v5ent.rapid4j.web.model.MenuExample;

public interface MenuMapper extends GenericDao<Menu, String>{
	
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(String menuid);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example, RowBounds rb);
    
    List<Menu> selectByExample(MenuExample e);

    Menu selectByPrimaryKey(String menuid);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

}