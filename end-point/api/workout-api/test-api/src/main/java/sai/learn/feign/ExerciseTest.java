package sai.learn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FeignClient(
        name = "exercise"
        ,configuration = FeignConfig.class
//        , fallback = ExerciseTestFallback.class
)
public interface ExerciseTest extends Test
{
}

@Component
class ExerciseTestFallback implements ExerciseTest {
    @Override
    public List<String> getListValues() {
        return new ArrayList<>();
    }
}