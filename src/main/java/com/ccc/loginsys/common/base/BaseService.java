package com.ccc.loginsys.common.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ccc.loginsys.common.pageUtil.Page;

/**
 * @Description: 泛型类，基础的Service接口
 */
public interface BaseService<T> {
    public List<T> findPage(Page<?> page);                //分页查询

    public List<T> find(Map<?, ?> paraMap);                //带条件查询，条件可以为null，既没有条件；返回list对象集合

    public T selectByPrimaryKey(Serializable id);                    //只查询一个，常用于修改

    public int insert(T entity);                    //插入，用实体作为参数

    public int updateByPrimaryKey(T entity);                    //修改，用实体作为参数

    public int deleteByPrimaryKey(Serializable id);        //按id删除，删除一条；支持整数型和字符串类型ID

    public int delete(List<?> ids);            //批量删除；支持整数型和字符串类型ID
}
