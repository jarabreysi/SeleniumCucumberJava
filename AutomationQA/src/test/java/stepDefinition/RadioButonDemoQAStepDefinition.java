
package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import page.ChexBoxDemoQaPage;
import page.RadioButonDemoQaPage;

public class RadioButonDemoQAStepDefinition {

    RadioButonDemoQaPage radioButonDemoQaPage = new RadioButonDemoQaPage();


    //-------------------------------------------MENU RADIO BUTON

    @Given("^que el usuario se encuentra en el home de demoqa$")
    public void queElUsuarioSeEncuentraEnElHomeDeDemoqa() {
        radioButonDemoQaPage.setDriver(WebDriverManager.inicializarBrowser());
        radioButonDemoQaPage.open();
    }

    @And("^seleciona la cateroria del home \"([^\"]*)\"$")
    public void selecionaLaCateroriaDelHome(String sCategory) throws Throwable {
        radioButonDemoQaPage.selectCategory(sCategory);
    }

    @When("^Selecciona la opcion del menu de la categoria en home \"([^\"]*)\"$")
    public void seleccionaLaOpcionDelMenuDeLaCategoriaEnHome(String sMenu) throws Throwable {
        radioButonDemoQaPage.selectMenu(sMenu);
    }


    @Then("^presiona clic en una de las opciones$")
    public void presionaClicEnUnaDeLasOpciones() {
        radioButonDemoQaPage.selectOptionRadioButon();
    }
}
