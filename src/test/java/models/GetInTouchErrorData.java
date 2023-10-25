package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetInTouchErrorData {

    private String file;
    private String textEn;
    private String textRu;
    private String textAr;
    private String textPl;
    private String textDe;

}
