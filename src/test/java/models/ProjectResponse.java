package models;
import lombok.Data;

@Data
public class ProjectResponse {
    private String name, createdBy, lastModifiedBy;
    private int id;
    private boolean isPublic;
    private Long createdDate,lastModifiedDate;
}
