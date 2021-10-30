package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import org.junit.Assert;
import page.LoginFacebookPage;

public class LoginFacebookStep {

    LoginFacebookPage loginFacebookPage = new LoginFacebookPage();

    @Given("^que el usuario se encuentra en el home de Facebook$")
    public void queElUsuarioSeEncuentraEnElHomeDeFacebook() {
        loginFacebookPage.setDriver(WebDriverManager.inicializarBrowser());
        loginFacebookPage.open();
    }

    @When("^se ingresa un email \"([^\"]*)\"$")
    public void seIngresaUnEmail(String sEmail) throws Throwable {
        loginFacebookPage.ingresarEmail(sEmail);
    }

    @And("^se ingresa la contrasena \"([^\"]*)\"$")
    public void seIngresaLaContrasena(String sPass) throws Throwable {
        loginFacebookPage.ingresarPass(sPass);
    }

    @And("^se clickea en el boton ingresar$")
    public void seClickeaEnElBotonIngresar() {
        loginFacebookPage.clicIngresar();
    }

    @Then("^la aplicacion muestra el resultado de \"([^\"]*)\" facebook$")
    public void laAplicacionMuestraElResultadoDeFacebook(String sMensajeError) throws Throwable {
        Assert.assertTrue("El mensaje encontrado no es el esperado", loginFacebookPage.validarCredenciales(sMensajeError));
    }




    @Given("^el usuario se encuentra en el home de Facebook$")
    public void elUsuarioSeEncuentraEnElHomeDeFacebook() {
        loginFacebookPage.setDriver(WebDriverManager.inicializarBrowser());
        loginFacebookPage.open();
    }

    @When("^se ingresa un email \"([^\"]*)\" correcto$")
    public void seIngresaUnEmailCorrecto(String sEmail) throws Throwable {
        loginFacebookPage.ingresarEmail(sEmail);
    }

    @And("^se ingresa la contrasena \"([^\"]*)\" correcto$")
    public void seIngresaLaContrasenaCorrecto(String sPass) throws Throwable {
        loginFacebookPage.ingresarPass(sPass);
    }

    @And("^se clickea en el boton iniciarSesion$")
    public void seClickeaEnElBotonIniciarSesion() {
        loginFacebookPage.clicIngresar();
    }


    @Then("^la aplicacion permitira el ingreso correcto$")
    public void laAplicacionPermitiraElIngresoCorrecto() {

    }
}
