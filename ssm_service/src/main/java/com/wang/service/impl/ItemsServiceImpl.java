package com.wang.service.impl;

import com.wang.bean.Items;
import com.wang.dao.ItemsDao;
import com.wang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:WangLiPeng
 * @Date:2020/9/14', 0014 18:32:57
 * @Email:summer_6121@163.com
 */

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    
    @Autowired
    private ItemsDao itemsDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    @Override
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}
