package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectsData {

    String projectName;
    String projectDescription;
    String projectDescriptionRu;
    String projectDescriptionAr;
    String projectDescriptionPl;
    String projectDescriptionDe;
}
