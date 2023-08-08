package models;
import lombok.Data;

@Data
public class CommentResponse {
    private String body, createdBy, lastModifiedBy;
    private int id, testCaseId;
    private Long createdDate, lastModifiedDate;
}

