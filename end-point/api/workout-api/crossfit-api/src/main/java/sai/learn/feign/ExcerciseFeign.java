package sai.learn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import sai.learn.dto.ExerciseDTO;

import java.util.List;

@FeignClient("exercise")
public interface ExcerciseFeign {

    @GetMapping("pullup")
    public List<ExerciseDTO> getPullupExercise();
}
