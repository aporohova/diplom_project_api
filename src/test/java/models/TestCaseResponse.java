package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class TestCaseResponse {
    String id, name, statusName;
    boolean automated, external;
    long createdDate;
}
