package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.instagram.com/?hl=es")
public class LoginInstagramPage extends WebDriverDOM {

    @FindBy(name = "username")
    private WebElement txtEmail;

    @FindBy(name = "password")
    private WebElement txtPass;

    @FindBy(xpath = "//button[@class='sqdOP  L3NKy   y3zKF     ']/div")
    private WebElement btnIniciar;

    @FindBy(className = "slfErrorAlert")
    private WebElement txtEncontrado;


    public void ingregaEmail(String sEmail) {
        waitElementVisible(txtEmail, 2);
        if (txtEmail.isEnabled()) {
            txtEmail.clear();
            txtEmail.sendKeys(sEmail);
        }
    }

    public void ingresarPassword(String sPass) {
        waitElementVisible(txtPass, 2);
        if (txtPass.isEnabled()) {
            txtPass.clear();
            txtPass.sendKeys(sPass);
        }
    }


    public void clicIniciar() {
        waitElementVisible(btnIniciar, 2);
        if (btnIniciar.isEnabled()) {
            btnIniciar.click();
        }
    }

    public boolean validaCredenciales(String sMensajeError) {
        waitElementVisible(txtEncontrado, 2);
        boolean value = false;

        if (txtEncontrado.getText().contains(sMensajeError)) {
            value = true;
        }
        return value;

    }


}
