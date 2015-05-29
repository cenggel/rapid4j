package com.v5ent.rapid4j.web.service;

import java.util.List;

import com.v5ent.rapid4j.core.generic.GenericService;
import com.v5ent.rapid4j.web.model.Role;

/**
 * 角色 业务接口
 * 
 * @author Mignet
 * @since 2014年6月10日 下午4:15:01
 **/
public interface RoleService extends GenericService<Role, Long> {
    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
