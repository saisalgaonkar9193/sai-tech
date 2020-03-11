package sai.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private String category;
    private String categoryDesc;
    private String categoryImg;

    public Category(String category, String categoryDesc) {
        this.category = category;
        this.categoryDesc = categoryDesc;
    }
}
