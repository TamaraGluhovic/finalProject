package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter public class HomePage extends BasePage {


    private By cardsOnHomePage = By.className("category-cards");





    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public boolean isCardsVisibleOnHomePage(){
        return getDriver().findElement(cardsOnHomePage).isDisplayed();
    }





}
