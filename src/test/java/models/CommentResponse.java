package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentResponse {
    String body, createdBy, lastModifiedBy;
    int id, testCaseId;
    Long createdDate, lastModifiedDate;
}

