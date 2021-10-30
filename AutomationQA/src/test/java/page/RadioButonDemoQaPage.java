package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://demoqa.com/")
public class RadioButonDemoQaPage extends WebDriverDOM {

    WebDriver driver;
    //:::::::::::::::::::::::::::::::::::LOCALIZADORES: MENU CHEKBOX ::::::::::::::::::::::::::::::::::::::

    @FindBy(className = "category-cards")    // el inicio de demoqa se presenta en categorias para poder realizar un clic
    private WebElement category;

    //div[@class='category-cards']/div/div/div[3]/h5       // no clickeable el elments

    @FindBy(xpath = "//div[@class='accordion']/div[1]/div/ul")  //Menu ejemplo elements, form
    private WebElement opcionMenu;



    //:::::::::::::::::::::::::::::::::::FIN LOCALIZADORES: MENU CHEKBOX ::::::::::::::::::::::::::::::::::::::

    //_____________________________________LOCALIZADORES: RADIO BUTTON_______________________________________


    @FindBy(xpath = "//div[@class='custom-control custom-radio custom-control-inline']")  //
    private WebElement rbo;

    @FindBy(id = "yesRadio")  //
    private WebElement rboYes;

    @FindBy(xpath =  " //input[@id='yesRadio']")  //
    private WebElement rboYes2;

    @FindBy(id = "impressiveRadio")  //
    private WebElement rboImpressive;

    @FindBy(id = "noRadio")  //
    private WebElement rboNoRadio;



    //_____________________________________FIN LOCALIZADORES: RADIO BUTTON_______________________________________



    //:::::::::::::::::::::::::::::::::::MENU CHEKBOX ::::::::::::::::::::::::::::::::::::::
    public void selectCategory(String sCategory) {
        waitElementVisible(category, 5);
        List<WebElement> listCategory = category.findElements(By.className("card-body")); //no clicleable encontro la palabra
        List<WebElement> listCategoryObejct = category.findElements(By.className("card-up"));

        for (int i = 0; i < listCategory.size(); i++) {
            if (listCategory.get(i).getText().equals(sCategory)) {
                System.out.println("Encontro el .:" + listCategory.get(i).getText());
                listCategoryObejct.get(i).click();
                break;
            }

        }
    }

    public void selectMenu(String sAccordion) {

        waitElementVisible(opcionMenu, 5);
        List<WebElement> listMenu = opcionMenu.findElements(By.xpath("//li/span"));

        for (int i = 0; i < listMenu.size(); i++) {
            if (listMenu.get(i).getText().contains(sAccordion)) {
                System.out.printf(listMenu.get(i).getText());
                listMenu.get(i).click();
                break;
            }
        }
    }

    //:::::::::::::::::::::::::::::::::::FIN MENU CHEKBOX :::::::::::::::::::::::::::::::::::::::::::

    public void selectOptionRadioButon(){

//        driver.findElement(By.cssSelector("input[id='yesRadio']")).click();

        String  sCbo ="Yes";
        List<WebElement> lisRbo = rbo.findElements(By.xpath("//input"));
        List<WebElement> lisRboLabel = rbo.findElements(By.xpath("//label"));
       // WebElement lisRbo= driver.findElement(By.id("yesRadio"));


        for (int i = 0; i < lisRboLabel.size(); i++) {
            if (lisRboLabel.get(i).getText().contains(sCbo)) {
                System.out.println("\n dime que Encontro : " + lisRboLabel.get(i).getText());
              //  System.out.println("\n dime que Encontro 3 : " +  lisRbo.get(i).click());
                lisRbo.get(i).click();

                break;
            }

        }

    }


}


