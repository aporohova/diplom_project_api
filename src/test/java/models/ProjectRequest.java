package models;
import lombok.Data;

@Data

public class ProjectRequest {
    private String createdBy, lastModifiedBy, name;
    private int id;
    private long createdDate;
    private boolean isPublic;
}
