package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Getter
public class HomeElements extends BasePage{

    private By cardBody = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div");
    private By menuList = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul");

    public HomeElements(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void selectElementsCard(){
        WebElement element = getDriver().findElement(cardBody);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element);

    }

    public void clickOnElementsCard(){
        getDriver().findElement(cardBody).click();
    }


    public boolean allElementsDisplayed(){
        return !getDriver().findElements(menuList).isEmpty();
    }



}
