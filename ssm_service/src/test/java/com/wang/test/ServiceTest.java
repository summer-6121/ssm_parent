package com.wang.test;

import com.wang.bean.Items;
import com.wang.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:WangLiPeng
 * @Date:2020/9/14', 0014 19:34:28
 * @Email:summer_6121@163.com
 */
public class ServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
       
}
