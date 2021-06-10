package com.example.demo.Controller;

import com.example.demo.Service.DoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private DoService doService;


    @RequestMapping("/getData")
    public  String getData (){
       return doService.aa();
    }
}
