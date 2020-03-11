package sai.learn.documents;

import com.bayview.core.domain.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "yoga")
public class YogaDocument extends BaseEntity {

    private String aasan;

    private String type;

}
