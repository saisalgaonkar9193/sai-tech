package sai.learn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FeignClient(
        name="crossfit"
        ,configuration = FeignConfig.class
//        ,fallback = CrossFitTestFallback.class
)
public interface CrossFitTest extends Test
{
}


@Component
class CrossFitTestFallback implements CrossFitTest {
    @Override
    public List<String> getListValues() {
        return new ArrayList<>();
    }
}