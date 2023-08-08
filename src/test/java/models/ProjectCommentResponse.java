package models;
import lombok.Data;

@Data
public class ProjectCommentResponse {
    private String createdBy, description, lastModifiedBy, name;
    private long createdDate, lastModifiedDate;
    private int id;
    private boolean isPublic;
}
