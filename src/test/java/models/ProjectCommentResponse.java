package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectCommentResponse {
    String createdBy, description, lastModifiedBy, name;
    long createdDate, lastModifiedDate;
    int id;
    boolean isPublic;
}
