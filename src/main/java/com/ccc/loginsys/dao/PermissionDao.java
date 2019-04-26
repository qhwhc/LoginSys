package com.ccc.loginsys.dao;

import com.ccc.loginsys.common.base.BaseDao;
import com.ccc.loginsys.dto.Permission;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface PermissionDao extends BaseDao<Permission> {

}