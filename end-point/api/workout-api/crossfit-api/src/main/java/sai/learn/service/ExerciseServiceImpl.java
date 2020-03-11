package sai.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sai.learn.dto.ExerciseDTO;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private FeignService feignService;

    @Override
    public List<ExerciseDTO> getPullupExcerciseList() {
        return feignService.getPullupExerciseList();
    }
}
