package sai.learn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestClass {
    
    @GetMapping("list")
    public ResponseEntity getListValues()throws Exception{
        System.out.println("Request for List");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<String> lst= new ArrayList<>();
        lst.add("CrossFit 1");
        lst.add("CrossFit 2");
        if(true) {
//            throw new Exception("Jabardasti band");
            return ResponseEntity.badRequest().body(new Exception("Jabardasti band"));
        }
        return ResponseEntity.ok(lst);
    }
    
}