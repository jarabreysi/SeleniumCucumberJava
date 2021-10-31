package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://demoqa.com/webtables")
public class WebTableDemoQAPage extends WebDriverDOM {
    WebDriver driver;

    @FindBy(className = "category-cards")
    // el inicio de demoqa se presenta en categorias para poder realizar un clic
    private WebElement category;

    @FindBy(xpath = "//div[@class='accordion']/div[1]/div/ul")  //Menu ejemplo elements, form
    private WebElement opcionMenu;

    @FindBy(id = "addNewRecordButton")
    private WebElement btnAdd;

    @FindBy(xpath = "//div[@class='modal-body']/form")
    private WebElement formulario;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    private WebElement btnEdit;

    @FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div/div[7]/div/span[1]")
    private WebElement botonEdit;

    @FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div/div[7]/div/span[2]")
    private WebElement botonDelete;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "searchBox")
    private WebElement txtBuscar;

    public void selectCategory(String sCategory) {
        waitElementVisible(category, 5);
        List<WebElement> listCategory = category.findElements(By.className("card-body")); //no clicleable encontro la palabra
        List<WebElement> listCategoryObejct = category.findElements(By.className("card-up"));

        for (int i = 0; i < listCategory.size(); i++) {
            if (listCategory.get(i).getText().equals(sCategory)) {
                System.out.println("Encontro el .:" + listCategory.get(i).getText());
                listCategoryObejct.get(i).click();
                break;
            }

        }
    }

    public void selectMenu(String sAccordion) {

        waitElementVisible(opcionMenu, 5);
        List<WebElement> listMenu = opcionMenu.findElements(By.xpath("//li/span"));

        for (int i = 0; i < listMenu.size(); i++) {
            if (listMenu.get(i).getText().contains(sAccordion)) {
                System.out.printf(listMenu.get(i).getText());
                listMenu.get(i).click();
                break;
            }
        }
    }
    //-------> check box


    public void clicBtnAdd() {
        waitElementVisible(btnAdd, 5);
        btnAdd.click();
    }

    public void deleteTexbox() {

        WebElement formularioName = formulario.findElement(By.xpath("//div[1]/div[2]/input"));
        WebElement formularioLastName = formulario.findElement(By.xpath(" //div[2]/div[2]/input"));
        WebElement formularioEmail = formulario.findElement(By.xpath("//div[3]/div[2]/input"));
        WebElement formularioAge = formulario.findElement(By.xpath("//div[4]/div[2]/input"));
        WebElement formularioSalary = formulario.findElement(By.xpath("//div[5]/div[2]/input"));
        WebElement formularioDepartment = formulario.findElement(By.xpath("//div[6]/div[2]/input"));

        formularioName.clear();
        formularioLastName.clear();
        formularioEmail.clear();
        formularioAge.clear();
        formularioSalary.clear();
        formularioName.clear();
        formularioDepartment.clear();

    }


    public void saveDatos(String sName, String sLastName, String sEmail, String sAge, String sSalary, String sDepartment) {
        waitElementVisible(formulario, 5);
        // lenar formulario
        WebElement formularioName = formulario.findElement(By.xpath("//div[1]/div[2]/input"));
        WebElement formularioLastName = formulario.findElement(By.xpath(" //div[2]/div[2]/input"));
        WebElement formularioEmail = formulario.findElement(By.xpath("//div[3]/div[2]/input"));
        WebElement formularioAge = formulario.findElement(By.xpath("//div[4]/div[2]/input"));
        WebElement formularioSalary = formulario.findElement(By.xpath("//div[5]/div[2]/input"));
        WebElement formularioDepartment = formulario.findElement(By.xpath("//div[6]/div[2]/input"));

        //Escribir en los texbox lo que gustes
        formularioName.clear();
        formularioName.sendKeys(sName);
        formularioLastName.clear();
        formularioLastName.sendKeys(sLastName);
        formularioEmail.clear();
        formularioEmail.sendKeys(sEmail);
        formularioAge.clear();
        formularioAge.sendKeys(sAge);
        formularioSalary.clear();
        formularioSalary.sendKeys(sSalary);
        formularioDepartment.clear();
        formularioDepartment.sendKeys(sDepartment);


    }


    public void buscarName(String name) {

        waitElementVisible(txtBuscar, 5);
        txtBuscar.sendKeys(name);

    }

    public void clicEdit() {
        waitElementVisible(botonEdit, 5);
        botonEdit.click();

        /*
        List<WebElement> listBuscarTexto = btnEdit.findElements(By.xpath("//div/div/div[1]")); // texto a buscar
        List<WebElement> Icon = btnEdit.findElements(By.xpath("//div/div/div[7]/div/span[1]")); //clic en el icono editar

       // para editar en la tabla buscado por nombre
        for (int i = 0; i < listBuscarTexto.size(); i++) {
            if (listBuscarTexto.get(i).getText().contains(name)) {
                Icon.get(i).click();
                break;
            }
        }
        */


    }


    public void clicDelete(){
        waitElementVisible(botonDelete, 5);
        botonDelete.click();
    }

    public void clickSubmit() {

        waitElementVisible(submit, 5);
        submit.submit();
    }

}
