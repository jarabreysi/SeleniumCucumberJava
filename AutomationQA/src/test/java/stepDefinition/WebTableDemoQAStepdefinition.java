package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import page.WebTableDemoQAPage;

public class WebTableDemoQAStepdefinition {

     WebTableDemoQAPage webTableDemoQAPage = new WebTableDemoQAPage();

    @Given("^que el usuario se encuentra en el home de DemoQA$")
    public void queElUsuarioSeEncuentraEnElHomeDeDemoQA() {
        webTableDemoQAPage.setDriver(WebDriverManager.inicializarBrowser());
        webTableDemoQAPage.open();
    }


    @When("^se clickea en el boton add$")
    public void seClickeaEnElBotonAdd() {
        webTableDemoQAPage.clicBtnAdd();
    }

    @Then("^se ingresa lo datos \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void seIngresaLoDatos(String sName,String sLastName,String sEmail,String sAge,String sSalary ,String sDepartment) throws Throwable {
        webTableDemoQAPage.saveDatos(sName,sLastName,sEmail,sAge,sSalary,sDepartment);
    }

    @And("^se clickea en el boton submit$")
    public void seClickeaEnElBotonSubmit() {
        webTableDemoQAPage.clickSubmit();
    }

    @Given("^que el usuario se encuentra en el DemoQA webta Table$")
    public void queElUsuarioSeEncuentraEnElDemoQAWebtaTable() {
        webTableDemoQAPage.setDriver(WebDriverManager.inicializarBrowser());
        webTableDemoQAPage.open();
    }

    @When("^se clickea en el span edit \"([^\"]*)\"$")
    public void seClickeaEnElSpanEdit(String arg0) throws Throwable {
        webTableDemoQAPage.clicEdit(arg0);
    }



    @Then("^se ingresa lo datos para editar \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void seIngresaLoDatosParaEditar(String sName,String sLastName,String sEmail,String sAge,String sSalary ,String sDepartment) throws Throwable {
        webTableDemoQAPage.saveDatos(sName,sLastName,sEmail,sAge,sSalary,sDepartment);
    }

    @And("^se clickea en el boton enviar$")
    public void seClickeaEnElBotonEnviar() {
        webTableDemoQAPage.clickSubmit();
    }



}
