package sai.learn.service;

import sai.learn.dto.ExerciseDTO;

import java.util.List;

public interface FeignService {

    public List<ExerciseDTO> getPullupExerciseList();

}
