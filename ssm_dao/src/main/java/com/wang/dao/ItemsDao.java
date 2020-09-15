package com.wang.dao;

import com.wang.bean.Items;

import java.util.List;

/**
 * @Author:WangLiPeng
 * @Date:2020/9/14', 0014 17:59:34
 * @Email:summer_6121@163.com
 */
public interface ItemsDao{

    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
    
}
