package models;
import lombok.Data;
import java.util.List;
@Data
public class DashboardResponse {
    int id, projectId;
    String name, createdBy, lastModifiedBy;
    Long createdDate,lastModifiedDate;
    List<String> widgets;
}


