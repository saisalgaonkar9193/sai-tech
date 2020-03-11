package sai.learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sai.learn.documents.YogaDocument;

import java.util.Optional;

public interface YogaDocumentRepository extends MongoRepository<YogaDocument,String> {
    Optional<YogaDocument> findByAasan(String aasan);
}
