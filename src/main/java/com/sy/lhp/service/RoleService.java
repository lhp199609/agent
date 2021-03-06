package com.sy.lhp.service;

import com.github.pagehelper.PageInfo;
import com.sy.lhp.model.Role;

public interface RoleService  {

    Integer save(Role role) throws Exception;

    Integer removeById(Integer id) throws Exception;

    Integer modify(Role role) throws Exception;

    PageInfo findByPage() throws Exception;

    Role findById(Integer id) throws Exception;


}
