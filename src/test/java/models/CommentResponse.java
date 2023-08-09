package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentResponse {
    private String body, createdBy, lastModifiedBy;
    private int id, testCaseId;
    private Long createdDate, lastModifiedDate;
}

