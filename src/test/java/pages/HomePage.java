package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public SelenideElement readMoreButton = $x("//div[@class='styles_welcome_content__Z84k5']//a[contains(@href,'/services')]");
    public SelenideElement martensProjectButton = $x("//img[@alt='Dr.Martens web-site']");
    public SelenideElement martensProjectDescription = $x("//article[@id='Martens']//p");
    public SelenideElement libraryLadderProjectButton = $x("//img[@alt='The Library ladder company web-site']");
    public SelenideElement libraryLadderProjectDescription = $x("//article[@id='Library']//p");
    public SelenideElement cartierProjectButton = $x("//img[@alt='Cartier web-site']");
    public SelenideElement cartierProjectDescription = $x("//article[@id='Cartier']//p");
    public SelenideElement wildTrainingProjectButton = $x("//img[@alt='Wild training web-site']");
    public SelenideElement wildTrainingProjectDescription = $x("//article[@id='Wild']//p");
    public SelenideElement moreProjectsButton = $x("//div[@class='styles_projects_grid__hlxX_']//a[contains(@href,'/portfolio')]");
}
