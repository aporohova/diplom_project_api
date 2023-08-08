package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectComment {
    private String createdBy, description, lastModifiedBy, name;
    private long createdDate, lastModifiedDate;
    private int id;
    private boolean isPublic;
}

