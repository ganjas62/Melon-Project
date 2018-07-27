package com.melon.demoweb.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.melon.demodao.basicdao.ItemDao;
import com.melon.demoentity.model.Item;

import io.swagger.annotations.Api;

@RestController
@Api
public class TestController {

  @Autowired
  private ItemDao itemDao;

  private Item makeItem(String itemName, BigDecimal price) {
    Item myItem = new Item();
    myItem.setItemName(itemName);
    myItem.setItemPrice(price);
    return this.itemDao.save(myItem);
  }

  @GetMapping("/getallitem")
  public String getAllItem() {
    return this.itemDao.findAll().toString();
  }

  @RequestMapping(value = "/insertitem", method = RequestMethod.POST)
  @ResponseBody
  public String insertItem(@RequestParam("itemName") String itemName, @RequestParam("itemPrice") BigDecimal itemPrice) {

    return this.makeItem(itemName, itemPrice).toString();
  }
}
