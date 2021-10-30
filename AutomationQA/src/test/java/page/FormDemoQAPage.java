package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/text-box")
public class FormDemoQAPage extends WebDriverDOM {

    @FindBy(id = "userName")
    private WebElement txtUserName;

    @FindBy(id = "userEmail")
    private WebElement txtUserEmail;

    @FindBy(id = "currentAddress")
    private WebElement txtCurrentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement txtPermanentAddress;

    @FindBy(id = "submit")
    private WebElement btnSubmit;


    //lo que resulta el texarea
    @FindBy(id = "name")
    private WebElement lblName;

    @FindBy(id = "email")
    private WebElement lblEmail;

    @FindBy(id = "currentAddress")
    private WebElement lblCurrentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement lblPermanentAddress;


    public void registrardatos(String sName, String sEmail, String sCurrentAddress, String sPermanentAddress) {
        waitElementVisible(txtUserName, 2);
        if (txtUserName.isEnabled() && txtUserEmail.isEnabled() && txtCurrentAddress.isEnabled() && txtPermanentAddress.isEnabled()) {
            txtUserName.clear();
            txtUserName.sendKeys(sName);
            txtUserEmail.clear();
            txtUserEmail.sendKeys(sEmail);
            txtCurrentAddress.clear();
            txtCurrentAddress.sendKeys(sCurrentAddress);
            txtPermanentAddress.clear();
            txtPermanentAddress.sendKeys(sPermanentAddress);
        }
    }

    public void clicSubmit() {
        waitElementVisible(btnSubmit, 2);
        btnSubmit.click();

    }

    public void mostrarDatosEnPantalla() {
        lblName.getText();
        lblEmail.getText();
        lblCurrentAddress.isDisplayed();
        lblPermanentAddress.isDisplayed();
        System.out.println(lblName);
    }

}
