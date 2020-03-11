package sai.learn.services;

import com.bayview.audit.service.GlobalAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sai.learn.documents.YogaDocument;
import sai.learn.dto.Category;
import sai.learn.repository.YogaDocumentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private GlobalAuditService globalAuditService;

    @Autowired
    private YogaDocumentRepository yogaDocumentRepository;

    @Override
    public List<Category> getCategoryList() {


        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Dhowti", "It cleanse body"));
        categoryList.add(new Category("Pranayam", "It strenthen breathing"));
        categoryList.add(new Category("Asanas", "Gives postures to body"));
        return categoryList;
    }

    @Override
    public YogaDocument saveEntity(YogaDocument document) {

        Optional<YogaDocument> yogaDocOpt = yogaDocumentRepository.findByAasan(document.getAasan());
        yogaDocOpt.ifPresent(yogaOldDocument -> {
            document.setId(yogaOldDocument.getId());
        });
        System.out.println();

//        globalAuditService.auditChanges(document);
        return yogaDocumentRepository.save(document);
    }
}
