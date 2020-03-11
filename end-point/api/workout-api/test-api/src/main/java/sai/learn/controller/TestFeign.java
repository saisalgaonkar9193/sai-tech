package sai.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import sai.learn.Validator.Request;
import sai.learn.enumeration.NoClaimBonusEnum;
import sai.learn.service.TestService;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class TestFeign {

    @Autowired
    private TestService testService;

    @GetMapping("list")
    public List<String> getList() {
        return testService.normalFeinCalls();
    }


    @GetMapping("hello")
    public ResponseEntity getHello(@RequestParam int den) throws Exception {
        try {
            testService.getData(den);
        } catch (Exception e) {

        }
        return ResponseEntity.ok("Hello");
    }

    @PostMapping("valid")
    public ResponseEntity getValidList(@RequestBody @Valid Request req) {
        System.out.println(req);

        return ResponseEntity.ok("Hello");
    }

    @PostMapping("flux")
    public Flux getFluxList(@RequestBody @Valid Request req) {

        Flux strFlux=Flux.just("Hello");

        return strFlux;
    }


    @GetMapping("enum")
    public void getEnumValue(@RequestParam("bonus") NoClaimBonusEnum bonus) {
//        NoClaimBonusEnum.
        System.out.println(bonus);
    }




    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();


        Date start=cal.getTime();

        cal.add(Calendar.HOUR  ,12 );
        Date end=cal.getTime();




    }


}
