package sai.learn.services;

import sai.learn.documents.YogaDocument;
import sai.learn.dto.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategoryList();

    YogaDocument saveEntity(YogaDocument document);

}
