package com.wang.controller;

import com.wang.bean.Items;
import com.wang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:WangLiPeng
 * @Date:2020/9/14', 0014 20:06:08
 * @Email:summer_6121@163.com
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    
    @Autowired
    private ItemsService itemsService;

    /**
     * 列表访问
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping("/save")
    public String save(Items items){
        int acount =  itemsService.save(items);
        //集合列表页跳转
        return "redirect:/items/list";
    }
}
