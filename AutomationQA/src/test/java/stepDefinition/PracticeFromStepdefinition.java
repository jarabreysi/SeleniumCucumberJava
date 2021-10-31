package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.WebDriverDOM;
import lib.WebDriverManager;
import page.PracticeFromPage;

public class PracticeFromStepdefinition {
    PracticeFromPage practiceFromPage = new PracticeFromPage();

    @Given("^que la web TollQa Practice Form esta disponible$")
    public void queLaWebTollQaPracticeFormEstaDisponible() {
        practiceFromPage.setDriver(WebDriverManager.inicializarBrowser());
        practiceFromPage.open();
    }


    @When("^se ingresa el Name \"([^\"]*)\"$")
    public void seIngresaElName(String sName) throws Throwable {
        practiceFromPage.ingresarName(sName);
    }

    @And("^se ingresa el LastName \"([^\"]*)\"$")
    public void seIngresaElLastName(String sLastName) throws Throwable {
        practiceFromPage.ingresarLastName(sLastName);
    }

    @And("^se ingresa el Email \"([^\"]*)\"$")
    public void seIngresaElEmail(String sUserEmail) throws Throwable {
        practiceFromPage.ingresarEmail(sUserEmail);
    }


    @And("^se seleciona el Genero \"([^\"]*)\"$")
    public void seSelecionaElGenero(String g) throws Throwable {
        practiceFromPage.selectionGenero(g);
    }



    @And("^se ingresa el Mobile \"([^\"]*)\"$")
    public void seIngresaElMobile(String sMobile) throws Throwable {
        practiceFromPage.ingresarMobile(sMobile);
    }

    @And("^se seleciona Date of Birth$")
    public void seSelecionaDateOfBirth() {
       // practiceFromPage.selectionDate();
    }

    @And("^se ingresa el Subject \"([^\"]*)\"$")
    public void seIngresaElSubject(String sSubjects) throws Throwable {
        practiceFromPage.ingresarSubjects(sSubjects);
    }

    @And("^se seleciona Hobbies \"([^\"]*)\"$")
    public void seSelecionaHobbies(String h) {
        practiceFromPage.selectionHobbies(h);
    }

    @And("^se carga el archivo$")
    public void seCargaElArchivo() {
        practiceFromPage.cargaImg();
    }

    @And("^se ingresa el CurrentAddress \"([^\"]*)\"$")
    public void seIngresaElCurrentAddress(String sAddress) throws Throwable {
        practiceFromPage.ingresarsCurrentAddress(sAddress);
    }

    @And("^se ingresa el sState \"([^\"]*)\"$")
    public void seIngresaElSState(String sState) throws Throwable {
        practiceFromPage.ingresarStateCity(sState);
    }

    @And("^se ingresa el sCity  \"([^\"]*)\"$")
    public void seIngresaElSCity(String sCity) throws Throwable {
        practiceFromPage.ingresarCity(sCity);
    }

    @And("^se clickea en el boton submit del formulario$")
    public void seClickeaEnElBotonSubmitDelFormulario() {
        practiceFromPage.submit();
    }

    @Then("^se muestra mis datos en una ventana emergente$")
    public void seMuestraMisDatosEnUnaVentanaEmergente() {
    }



}
