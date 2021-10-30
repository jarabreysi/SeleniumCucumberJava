package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://demoqa.com/")
public class ChexBoxDemoQaPage extends WebDriverDOM {

    WebDriver driver;
    //:::::::::::::::::::::::::::::::::::LOCALIZADORES: MENU CHEKBOX ::::::::::::::::::::::::::::::::::::::

    @FindBy(className = "category-cards")    // el inicio de demoqa se presenta en categorias para poder realizar un clic
    private WebElement category;

    //div[@class='category-cards']/div/div/div[3]/h5       // no clickeable el elments

    @FindBy(xpath = "//div[@class='accordion']/div[1]/div/ul")  //Menu ejemplo elements, form
    private WebElement opcionMenu;

    @FindBy(xpath = "//button[@class='rct-collapse rct-collapse-btn']")   // boton de one nivel  clic  >
    private WebElement btnHome;

    @FindBy(xpath = "//li[@class='rct-node rct-node-parent rct-node-expanded']")    // combo de primer nivel  clic que desgloza el dwo level
    private WebElement cbxHome;

    @FindBy(xpath = "//li[@class='rct-node rct-node-parent rct-node-collapsed']")    // combo de segundo nivel  clic que desgloza el three level
    private WebElement cbx3Nivel;

    //:::::::::::::::::::::::::::::::::::FIN LOCALIZADORES: MENU CHEKBOX ::::::::::::::::::::::::::::::::::::::

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
    //-------> check box

    public void clicHome() {
        waitElementVisible(btnHome, 5);
        btnHome.click();


    }

    public void seleccionarCbxHome(String sCbxHome) {
        waitElementVisible(cbxHome, 5);

        List<WebElement> listHome = cbxHome.findElements(By.xpath("//ol/li/span/label/span[1]")); //para dar check en  || Home
        List<WebElement> listCbxHome = cbxHome.findElements(By.xpath("//ol/li/span/label/span[3]"));  //BUscar la pabalabra por esto se va encontrar el desktop
        List<WebElement> list = cbxHome.findElements(By.xpath("//ol/li/span/button"));  //   >desktop  - - -    con esto se encuentra  > de desktop para dar click

        for (int i = 0; i < listCbxHome.size(); i++) {
            if (listCbxHome.get(i).getText().equals(sCbxHome)) {
                listHome.get(i).click();
                list.get(i).click();
                break;
            }
        }
    }

    public void comboTercerNivel(String sCbx2NivelItem, String sCbx3NivelItem) {

        seleccionarCbxHome(sCbx2NivelItem);  // MENU DE CHECKBOX DE 2 NIVELES

        List<WebElement> list3Principal = cbx3Nivel.findElements(By.xpath("//span/label/span[1]")); //chek
        List<WebElement> list3StringBuscar = cbx3Nivel.findElements(By.xpath("//span/label/span[3]")); // encontro la palabra
        List<WebElement> list3Secundario = cbx3Nivel.findElements(By.xpath("//span/button")); //para dar click al boton(>) en el 3 nivel

        for (int i = 0; i < list3StringBuscar.size(); i++) {
            if (list3StringBuscar.get(i).getText().equals(sCbx3NivelItem)) {
                list3Secundario.get(i).click();
                break;
            }

        }

    }

    //:::::::::::::::::::::::::::::::::::FIN MENU CHEKBOX :::::::::::::::::::::::::::::::::::::::::::





}


