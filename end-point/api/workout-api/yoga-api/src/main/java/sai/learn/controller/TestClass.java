package sai.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestClass {
    
    @GetMapping("list")
    public List<String> getListValues()throws Exception{
        System.out.println("Request for List");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<String> lst= new ArrayList<>();
        lst.add("Yoga 1");
        lst.add("Yoga 2");
//        if(true)
//            throw new Exception();
        return lst;
    }
    
}