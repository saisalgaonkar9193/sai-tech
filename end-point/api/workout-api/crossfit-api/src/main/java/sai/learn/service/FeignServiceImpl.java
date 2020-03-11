package sai.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sai.learn.dto.ExerciseDTO;
import sai.learn.feign.ExcerciseFeign;

import java.util.List;

@Service
public class FeignServiceImpl implements FeignService {

    @Autowired
    private ExcerciseFeign excerciseFeign;

    @Override
    public List<ExerciseDTO> getPullupExerciseList() {
        return excerciseFeign.getPullupExercise();
    }
}
