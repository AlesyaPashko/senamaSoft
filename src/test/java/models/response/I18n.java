package models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class I18n {

    private String defaultLocale;
    private ArrayList<String> locales;
    private boolean localeDetection;
}
