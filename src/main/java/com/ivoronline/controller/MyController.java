package com.ivoronline.controller;

import com.ivoronline.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // CREATE TABLE
  //=========================================================================================================
  @GetMapping("/createTable")
  public String createTable() {
    myService.createTable();
    return "OK";
  }

}
