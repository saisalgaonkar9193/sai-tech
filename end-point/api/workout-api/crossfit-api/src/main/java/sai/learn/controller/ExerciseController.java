package sai.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sai.learn.dto.ExerciseDTO;
import sai.learn.service.ExerciseService;

import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("pullup")
    public List<ExerciseDTO> getPullupExercise(){
        return exerciseService.getPullupExcerciseList();
    }

}
