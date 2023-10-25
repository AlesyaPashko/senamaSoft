package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeaderLanguageData {

    String language;
    String welcomeContent;
    String servicesContent;
    String portfolioContent;
    String contactsContent;
    String careerContent;
    String testimonialsContent;
}
