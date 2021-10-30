package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import org.junit.Assert;
import page.LoginInstagramPage;

public class LoginInstagramStepdefinition {

    LoginInstagramPage loginInstagramPage = new LoginInstagramPage();

    @Given("^que el usuario se encuentra en el home de instagram$")
    public void queElUsuarioSeEncuentraEnElHomeDeInstagram() {
        loginInstagramPage.setDriver(WebDriverManager.inicializarBrowser());
        loginInstagramPage.open();
    }

    @When("^se ingresa el email \"([^\"]*)\"$")
    public void seIngresaElEmail(String sEmail) throws Throwable {
        loginInstagramPage.ingregaEmail(sEmail);
        throw new PendingException();
    }

    @And("^se ingresa una contrasena \"([^\"]*)\"$")
    public void seIngresaUnaContrasena(String sPass) throws Throwable {
        loginInstagramPage.ingresarPassword(sPass);
    }

    @And("^se clickea en el boton iniciar$")
    public void seClickeaEnElBotonIniciar() {
        loginInstagramPage.clicIniciar();
    }

    @Then("^la aplicacion muestra el resultado de \"([^\"]*)\" instagram$")
    public void laAplicacionMuestraElResultadoDeInstagram(String sMensajeError) throws Throwable {
        Assert.assertTrue("El mensaje encontrado no es el esperado", loginInstagramPage.validaCredenciales(sMensajeError));

    }



}
