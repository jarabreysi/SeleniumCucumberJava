package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

@DefaultUrl("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
public class BasicHTMLFromPage extends WebDriverDOM {

    WebDriver driver;

    @FindBy(name = "username")
    WebElement txtUsername;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "comments")
    WebElement txtComments;

      @FindBy(name = "filename")
    WebElement filename;


   // @FindBy(xpath = "//input[@type='checkbox']")
    @FindBy(xpath = "//input[@value='cb1']")
    WebElement AllCheckBoxes ;

    @FindBy( xpath= "//input[@value='rd1']")
    WebElement rbo;


    @FindBy( name= "multipleselect[]")
    WebElement multipleselect;

    @FindBy( name= "dropdown")
    WebElement dropdown;

    @FindBy(name = "submitbutton")
    WebElement btnSubmit;

    // public void ingresarDatos(,String sState,String sCity){

    public void ingresarName(String sName) {
        waitElementVisible(txtUsername, 2);
        if (txtUsername.isEnabled()) {
            txtUsername.clear();
            txtUsername.sendKeys(sName);
        }
    }

    public void ingresarPassword(String sPassword) {
        waitElementVisible(txtPassword, 2);
        if (txtPassword.isEnabled()) {
            txtPassword.clear();
            txtPassword.sendKeys(sPassword);
        }
    }

    public void ingresarComments(String sComments) {
        waitElementVisible(txtComments, 2);
        if (txtComments.isEnabled()) {
            txtComments.clear();
            txtComments.sendKeys(sComments);
        }
    }


    public void cargaImg() {

        File file = new File("src/main/java/util/img/imagen.png");
        String path = file.getAbsolutePath();
        filename.sendKeys(path);
    }

    public void seleccionMultipleChecBox() {

       /* List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement cb : allCheckbox) {
            if (cb.isSelected()) {
                cb.click();
            }
        }

        */
       AllCheckBoxes.click();

    }

    public void seleccionRadioButon() {

        waitElementVisible(rbo, 2);
        rbo.click();
    }

    public void seleccionMultiple() {
        Select multi = new Select (multipleselect);
        multi.deselectByVisibleText("Selection Item 4"); //deseleciona
        multi.selectByVisibleText("Selection Item 1");
        multi.selectByIndex(1);
        multi.selectByValue("ms3");

    }

    public void seleccionDropdown() {
        Select sDropdown = new Select (dropdown);
        //sDropdown.deselectByValue("dd3");  //deseleciona
        sDropdown.selectByVisibleText("Drop Down Item 1");
        //multi.selectByIndex(1);
    }


    public void submit() {
        waitElementVisible(btnSubmit, 2);
        btnSubmit.submit();
    }
}
