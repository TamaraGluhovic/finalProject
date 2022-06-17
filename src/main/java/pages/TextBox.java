package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@Getter public class TextBox extends BasePage{

    private By chooseTextBoxField = By.id("item-0");
    private By userFormVisisble = By.id("userForm");
    private By fullNameInput = By.id("userName");
    private By emailInput = By.id("userEmail");
    private By currentAddressInput = By.id("currentAddress");
    private By permanentAddressInput = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By informationBox = By.id("name");


    public TextBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void chooseTextBoxElement(){
        getDriver().findElement(chooseTextBoxField).click();
    }

    public void addInformation(String fullName, String email, String currentAddress, String permanentAddress){

        getDriver().findElement(fullNameInput).sendKeys(fullName);
        getDriver().findElement(emailInput).sendKeys(email);
        getDriver().findElement(currentAddressInput).sendKeys(currentAddress);
        getDriver().findElement(permanentAddressInput).sendKeys(permanentAddress);

    }

    public void clickSubmit(){
        getDriver().findElement(submitButton).click();
    }

    public boolean isUserFormVisible(){
        return !getDriver().findElements(userFormVisisble).isEmpty();
    }

    public boolean boxWithAllInformationDisplayed(){
        return getDriver().findElement(informationBox).isDisplayed();
    }

}
