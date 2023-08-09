package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectResponse {
    private String name, createdBy, lastModifiedBy;
    private int id;
    private boolean isPublic;
    private Long createdDate,lastModifiedDate;
}
