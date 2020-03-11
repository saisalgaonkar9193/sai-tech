package sai.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sai.learn.config.ConfigProp;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestClass {

    @GetMapping("list")
    public ResponseEntity getListValues()throws Exception{
        System.out.println("Request for List");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> lst= new ArrayList<>();
        lst.add("Exercise 1");
        lst.add("Exercise 2");
        if(true) {
//            return ResponseEntity.badRequest().body("Jabardasti band");
        }
        return ResponseEntity.ok(lst);
    }

}
