package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectResponse {
    String name, createdBy, lastModifiedBy;
    int id, createdDate, lastModifiedDate;
    boolean isPublic;
    //id": 3469,
    //    "name": "112222",
    //    "isPublic": false,
    //    "createdDate": 1688557941788,
    //    "lastModifiedDate": 1688557941788,
    //    "createdBy": "allure8",
    //    "lastModifiedBy": "allure8"
}
