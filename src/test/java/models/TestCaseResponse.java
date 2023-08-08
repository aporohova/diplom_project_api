package models;
import lombok.Data;

@Data
public class TestCaseResponse {
    private String id, name, statusName;
    private boolean automated, external;
    private long createdDate;
}
