package com.wang.test;

import com.wang.bean.Items;
import com.wang.dao.ItemsDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author:WangLiPeng
 * @Date:2020/9/14', 0014 18:08:44
 * @Email:summer_6121@163.com
 */
public class DaoTest {
    
    
    @Test
    public void testDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
        System.out.println("商品列表：：："+itemsDao.findAll());
    }
    
    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        
        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
