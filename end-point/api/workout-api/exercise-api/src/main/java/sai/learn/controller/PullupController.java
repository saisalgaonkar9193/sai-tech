package sai.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sai.learn.dto.ExerciseDTO;
import sai.learn.service.PullupService;

import java.util.List;

@RestController
@RequestMapping("pullup")
public class PullupController {

    @Autowired
    private PullupService pullupService;

    @GetMapping("")
    public List<ExerciseDTO> getPullupExercise(){
        return pullupService.getPullupExcecises();
    }
}
