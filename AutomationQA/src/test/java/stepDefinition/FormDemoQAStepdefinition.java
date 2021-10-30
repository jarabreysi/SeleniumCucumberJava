package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import page.FormDemoQAPage;

public class FormDemoQAStepdefinition {

    FormDemoQAPage formularioPage = new FormDemoQAPage();

    @Given("^que la web TollQa esta disponible$")
    public void queLaWebTollQaEstaDisponible() {
        formularioPage.setDriver(WebDriverManager.inicializarBrowser());
        formularioPage.open();
    }


    @When("^ingreso mis datos \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresoMisDatos(String sName, String sEmail, String sCurrentAddress, String sPermanentAddress) {
        formularioPage.registrardatos(sName,sEmail,sCurrentAddress,sPermanentAddress);
    }


    @And("^se clickea en el boton sumit$")
    public void seClickeaEnElBotonSumit() {
        formularioPage.clicSubmit();
    }

    @Then("^se muestra mis datos en pantalla$")
    public void seMuestraMisDatosEnPantalla() {
        formularioPage.mostrarDatosEnPantalla();
    }



}
