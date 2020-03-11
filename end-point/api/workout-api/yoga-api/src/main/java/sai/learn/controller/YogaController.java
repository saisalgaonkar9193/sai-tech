package sai.learn.controller;

import com.bayview.audit.annotation.Auditable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sai.learn.aop.SymboNotifier;
import sai.learn.documents.YogaDocument;
import sai.learn.dto.Category;
import sai.learn.services.CategoryService;

import java.util.List;

@RestController
@RequestMapping()
public class YogaController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("category")
    public List<Category> getCategoryList(){
        return categoryService.getCategoryList();
    }

    @Auditable
    @PostMapping("save")
    public YogaDocument saveDocument(@RequestBody YogaDocument document){
        return categoryService.saveEntity(document);
    }
}
