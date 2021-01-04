package com.shangma.cn.service.base;

import com.shangma.cn.vo.PageVo;

import java.util.List;

/**
 * @author JAVASM
 */
public interface BaseService<T,ID> {
    /**
     * 分页查询
     * @return
     */
    PageVo<T> findPage();

    /**
     * 有条件的分页查询
     * @param example
     * @return
     */
    PageVo<T> findPage(Object example);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * 添加操作
     * @param entity
     * @return
     */
    int addEntity(T entity);

    /**
     * 修改操作
     * @param entity
     * @return
     */
    int updateEntity(T entity);

    /**
     * 删除操作
     * @param id
     * @return
     */
    int deleteById(ID id);

    /**
     * 批量添加
     * @param list
     * @return
     */
    int batchAddEntity(List<T> list);

    /**
     * 批量修改
     * @param list
     * @return
     */
    int batchUpdateEntity(List<T> list);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchDeleteByIds(List<ID> ids);

    /**
     * 封装分页数据
     * @param list
     * @return
     */
    PageVo<T> setPageVo(List<T> list);
}
