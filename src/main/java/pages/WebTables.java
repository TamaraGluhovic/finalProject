package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Getter public class WebTables extends BasePage{

    private By chooseWebTablesField = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]");
    private By addNewRecord = By.id("addNewRecordButton");

    //check Registration Form title for assert
    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By emailInput = By.id("userEmail");
    private By ageInput = By.id("age");
    private By salaryInput = By.id("salary");
    private By departmentInput = By.id("department");
    private By submitButton = By.id("submit");
    private By checkInformation = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div");

    private By searchFieldInput = By.id("searchBox");

    private By checkInputFromTable = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[6]");
    private By deleteRecord = By.id("delete-record-4");
    private By emptyRow = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]");
    private By webTablesWrapper = By.className("web-tables-wrapper");

    private By registrationForm = By.id("registration-form-modal");



    public WebTables(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnWebTables(){
        getDriver().findElement(chooseWebTablesField).click();
    }

    public void clickOnAddNewRecord(){
        getDriver().findElement(addNewRecord).click();
    }


    public void fillRegistrationForm(String firstName, String lastName, String email, String age, String salary, String department){
        getDriver().findElement(firstNameInput).sendKeys(firstName);
        getDriver().findElement(lastNameInput).sendKeys(lastName);
        getDriver().findElement(emailInput).sendKeys(email);
        getDriver().findElement(ageInput).sendKeys(age);
        getDriver().findElement(salaryInput).sendKeys(salary);
        getDriver().findElement(departmentInput).sendKeys(department);
        getDriver().findElement(submitButton).click();
    }


    public void javascriptScroll250(){
        JavascriptExecutor javascript = (JavascriptExecutor) getDriver();
        javascript.executeScript("window.scrollBy(0,250)", "");
    }

    public boolean areAddedInformationVisible(){
        return getDriver().findElement(checkInformation).isDisplayed();
    }



    public void parseInformation(String name){
        getDriver().findElement(searchFieldInput).sendKeys(name);

    }

    public void clickSearch(){
        getDriver().findElement(searchFieldInput).click();

    }

    public String searchResult() {
        return getDriver().findElement(checkInputFromTable).getText();
    }



    public void deleteNewRecord(){
        getDriver().findElement(deleteRecord).click();
    }

    public boolean isRecordDeleted(){
        return !getDriver().findElements(emptyRow).isEmpty();
    }


    public boolean isRegistrationFormVisible(){
        return getDriver().findElement(registrationForm).isDisplayed();
    }



    public boolean isWebTablesDisplayed(){
        return getDriver().findElement(webTablesWrapper).isDisplayed();
    }








}
