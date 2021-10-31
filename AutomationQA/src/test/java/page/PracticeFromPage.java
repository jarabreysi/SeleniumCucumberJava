package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticeFromPage extends WebDriverDOM {

    WebDriver driver;

    @FindBy(id = "firstName")
    WebElement txtFirstName;

    @FindBy(id = "lastName")
    WebElement txtLastName;

    @FindBy(id = "userEmail")
    WebElement txtUserEmail;

    @FindBy(xpath = "//form[@id='userForm']")
    WebElement generic;

    @FindBy(id = "userNumber")
    WebElement txtUserNumber;

    @FindBy(id = "subjectsInput")
    WebElement txtSubjects;

    @FindBy(id = "currentAddress")
    WebElement txtCurrentAddress;

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']/div[2]/div/div/div[1]/div[2]/div/input")
    WebElement txtStateCity;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']/div[3]/div/div/div[1]/div[2]/div/input")
    WebElement txtCity;


    @FindBy(id = "submit")
    WebElement btnSubmit;


    public void ingresarName(String sName) {
        waitElementVisible(txtFirstName, 2);
        if (txtFirstName.isEnabled()) {
            txtFirstName.clear();
            txtFirstName.sendKeys(sName);
        }
    }

    public void ingresarLastName(String sLastName) {
        waitElementVisible(txtLastName, 2);
        if (txtLastName.isEnabled()) {
            txtLastName.clear();
            txtLastName.sendKeys(sLastName);
        }
    }

    public void ingresarEmail(String sEmail) {
        waitElementVisible(txtUserEmail, 2);
        if (txtUserEmail.isEnabled()) {
            txtUserEmail.clear();
            txtUserEmail.sendKeys(sEmail);
        }
    }

    public void selectionGenero(String sGender) {
   // waitElementVisible(rboGender, 5);

    //    List<WebElement> genderLabel = rboGender.findElements(By.xpath("//div[2]/div/label"));
        List<WebElement> genderLabel = generic.findElements(By.xpath("//div[3]/div[2]/div/label"));
        List<WebElement> icon = generic.findElements(By.xpath("//div[3]/div[2]/div/input"));

        //clic en genero
        for (int i = 0; i < genderLabel.size(); i++) {
            if (genderLabel.get(i).getText().contains(sGender)) {
                System.out.println("Gener: " + genderLabel.get(i).getText());
                icon.get(i).sendKeys(Keys.SPACE);
                break;
            }
        }

  /*
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",checkBoxEnabled);
*/
    }

    public void ingresarMobile(String sMobile) {
        waitElementVisible(txtUserNumber, 2);
        if (txtUserNumber.isEnabled()) {
            txtUserNumber.clear();
            txtUserNumber.sendKeys(sMobile);
        }
    }

    public void selectionDate(){
        String date ="13-August-2020";
        String[] dateArr = date.split("-");
        String day=dateArr[0];
        String month=dateArr[1];
        String year=dateArr[2];
        WebElement dateOfBirthInput =driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();

        Select selectMonth = new Select(driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
        //System.out.println(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]")).getText());
        selectMonth.selectByVisibleText(month);

        Select selectYear=new Select(driver.findElement(By.className("react-datepicker__year-select")));
        selectYear.selectByVisibleText(year);
        String beforePath="//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[";
        String afterPath="]/div[";
        boolean flag=false;
        for (int row =1 ;row <=6; row++) {
            for (int col =1; col<=7; col++) {
                //   System.out.println(driver.findElement(By.xpath(beforePath+row+afterPath+col+"]")).getText());
                if(driver.findElement(By.xpath(beforePath+row+afterPath+col+"]")).getText().equals(day)) {
                    driver.findElement(By.xpath(beforePath+row+afterPath+col+"]")).click();
                    flag=true;
                    break;
                }
                if(flag)
                    break;
            }
        }
    }
    public void ingresarSubjects(String sSubjects) {
        waitElementVisible(txtSubjects, 2);
        if (txtSubjects.isEnabled()) {
            txtSubjects.clear();
            txtSubjects.sendKeys(sSubjects);
            txtSubjects.sendKeys(Keys.ENTER);
        }
    }

    public void selectionHobbies(String sHobbies) {


        List<WebElement> hobbiesLabel = generic.findElements(By.xpath("//div[7]/div[2]/div/label"));
        List<WebElement> rboHobbies = generic.findElements(By.xpath("//div[7]/div[2]/div/input"));

        //clic en genero
        for (int i = 0; i < hobbiesLabel.size(); i++) {
            if (hobbiesLabel.get(i).getText().contains(sHobbies)) {
                System.out.println("Sports: " + hobbiesLabel.get(i).getText());
                rboHobbies.get(i).sendKeys(Keys.SPACE);
                break;
            }
        }
}




    public void cargaImg() {

        File file = new File("src/main/java/util/img/imagen.png");
        String path = file.getAbsolutePath();
        uploadPicture.sendKeys(path);
    }

    public void ingresarsCurrentAddress(String sCurrentAddress) {
        waitElementVisible(txtCurrentAddress, 2);
        if (txtCurrentAddress.isEnabled()) {
            txtCurrentAddress.clear();
            txtCurrentAddress.sendKeys(sCurrentAddress);
        }
    }

    public void ingresarStateCity(String stateCity) {
        waitElementVisible(txtStateCity, 2);
        if (txtStateCity.isEnabled()) {
            txtStateCity.clear();
            txtStateCity.sendKeys(stateCity + Keys.ENTER);
            //txtStateCity.sendKeys(Keys.TAB);
        }
    }

    public void ingresarCity(String sCity) {
        waitElementVisible(txtCity, 2);
        if (txtCity.isEnabled()) {
            txtCity.clear();
            txtCity.sendKeys(sCity + Keys.ENTER);
        }
    }


    public void submit() {
        waitElementVisible(btnSubmit, 2);
        btnSubmit.submit();
    }
}
