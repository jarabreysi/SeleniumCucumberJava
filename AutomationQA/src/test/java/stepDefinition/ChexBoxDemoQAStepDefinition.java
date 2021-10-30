
package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import page.ChexBoxDemoQaPage;

public class ChexBoxDemoQAStepDefinition {

    ChexBoxDemoQaPage chexBoxDemoQaPage = new ChexBoxDemoQaPage();

    @Given("^que el usuario se encuentra en el home de demo qa$")
    public void queElUsuarioSeEncuentraEnElHomeDeDemoQa() {
        chexBoxDemoQaPage.setDriver(WebDriverManager.inicializarBrowser());
        chexBoxDemoQaPage.open();
    }

    @And("^seleciona la cateroria \"([^\"]*)\"$")
    public void selecionaLaCateroria(String sCategoria) throws Throwable {
        chexBoxDemoQaPage.selectCategory(sCategoria);
    }



    @And("^Selecciona la opcion del menu de la categoria \"([^\"]*)\"$")
    public void seleccionaLaOpcionDelMenuDeLaCategoria(String sMenu) throws Throwable {
        chexBoxDemoQaPage.selectMenu(sMenu);
    }
    @When("^selecciona el menu home$")
    public void seleccionaElMenuHome() {
        chexBoxDemoQaPage.clicHome();

    }

    @Then("^se obtine la opcion del menu \"([^\"]*)\" y de tecer nivel \"([^\"]*)\"$")
    public void seObtineLaOpcionDelMenuYDeTecerNivel(String sCbxLevel2, String sCbxLevel3) throws Throwable {
        chexBoxDemoQaPage.comboTercerNivel(sCbxLevel2,sCbxLevel3);
    }


    @And("^presiona clic en el menu \"([^\"]*)\"$")
    public void presionaClicEnElMenu(String arg0) throws Throwable {

    }


    //:::::::::::::::::::::::::::::::::::::::::::::::::FIN MENU CHECK BOX


}
