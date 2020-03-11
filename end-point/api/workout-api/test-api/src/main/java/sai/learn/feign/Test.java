package sai.learn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
public interface Test {
    @GetMapping("list")
    public List<String> getListValues();
}
