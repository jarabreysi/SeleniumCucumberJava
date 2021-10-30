package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import page.BasicHTMLFromPage;

public class BasicHTMLFormStepdefinition {

    BasicHTMLFromPage basicHTMLFromPage = new BasicHTMLFromPage();

    @Given("^que la web Basic HTML Form  esta disponible$")
    public void queLaWebBasicHTMLFormEstaDisponible() {
        basicHTMLFromPage.setDriver(WebDriverManager.inicializarBrowser());
        basicHTMLFromPage.open();
    }

    @When("^se ingresa el name \"([^\"]*)\"$")
    public void seIngresaElName(String arg0) throws Throwable {
        basicHTMLFromPage.ingresarName(arg0);
    }

    @And("^se ingresa el password \"([^\"]*)\"$")
    public void seIngresaElPassword(String arg0) throws Throwable {
        basicHTMLFromPage.ingresarPassword(arg0);
    }

    @And("^se ingresa el comments \"([^\"]*)\"$")
    public void seIngresaElComments(String arg0) throws Throwable {
        basicHTMLFromPage.ingresarComments(arg0);
    }

    @And("^se  carga un archivo$")
    public void seCargaUnArchivo() {
        basicHTMLFromPage.cargaImg();
    }

    @And("^se selecciona un chexbox$")
    public void seSeleccionaUnChexbox() {

        basicHTMLFromPage.seleccionMultipleChecBox();
    }

    @And("^se selecciona un radio buton$")
    public void seSeleccionaUnRadioButon() {
        basicHTMLFromPage.seleccionRadioButon();
    }

    @And("^se selecciona un multiple select$")
    public void seSeleccionaUnMultipleSelect() {

        basicHTMLFromPage.seleccionMultiple();
    }

    @And("^se selecciona un Dropdown$")
    public void seSeleccionaUnDropdown() {
        basicHTMLFromPage.seleccionDropdown();
    }

    @And("^se clickea en el btn submit del formulario$")
    public void seClickeaEnElBtnSubmitDelFormulario() {
        basicHTMLFromPage.submit();
    }

    @Then("^se muestra mis datos en una ventana$")
    public void seMuestraMisDatosEnUnaVentana() {
    }
}
