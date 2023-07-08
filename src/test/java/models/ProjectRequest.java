package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProjectRequest {
    Boolean isPublic;
    String name;
    //{isPublic: false, name: "112222"}
    //isPublic
    //:
    //false
    //name
    //:
    //"112222"
}
