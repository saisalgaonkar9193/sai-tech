package sai.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDTO {

    private String id;
    private String excerciseName;
    private String excerciseDesc;
    private String excerciseCategory;

    public ExerciseDTO(String excerciseName, String excerciseDesc, String excerciseCategory) {
        this.excerciseName = excerciseName;
        this.excerciseDesc = excerciseDesc;
        this.excerciseCategory = excerciseCategory;
    }
}
