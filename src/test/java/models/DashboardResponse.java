package models;
import lombok.Data;
import java.util.List;

@Data
public class DashboardResponse {
    private int id, projectId;
    private String name, createdBy, lastModifiedBy;
    private Long createdDate,lastModifiedDate;
    private List<String> widgets;
}


