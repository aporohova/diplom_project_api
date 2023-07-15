package models;
import lombok.Data;
@Data

public class ProjectRequest {
    String createdBy, lastModifiedBy, name;
    int id;
    long createdDate;
    boolean isPublic;
}
