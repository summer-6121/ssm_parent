package com.wang.service;

import com.wang.bean.Items;

import java.util.List;

/**
 * @Author:WangLiPeng
 * @Date:2020/9/14', 0014 18:27:55
 * @Email:summer_6121@163.com
 */
public interface ItemsService {
    List<Items> findAll();

    int save(Items items);
}
