package sai.learn.service;

import org.springframework.stereotype.Service;
import sai.learn.dto.ExerciseDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class PullupServiceImpl implements PullupService {
    @Override
    public List<ExerciseDTO> getPullupExcecises() {
        List<ExerciseDTO> pullupList=new ArrayList<>();
        pullupList.add(new ExerciseDTO("Conventional", "Sholder width grip", "Pullup"));
        pullupList.add(new ExerciseDTO("Conventional Wide Grip", "Wider grip", "Pullup"));
        pullupList.add(new ExerciseDTO("Reverse", "Over hand grip", "Pullup"));
        return pullupList;
    }
}
