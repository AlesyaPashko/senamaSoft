package models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextI18Next {

    private InitialI18nStore initialI18nStore;
    private String initialLocale;
    private ArrayList<String> ns;
    private UserConfig userConfig;
}
