package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter public class CheckBox extends BasePage{


    private By chooseCheckBoxField = By.id("item-1");
    private By selectHomeBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
    private By message = By.id("result");
    private By expand = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");





    public CheckBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnTheCheckBox(){
        getDriver().findElement(chooseCheckBoxField).click();
    }

    public void clickHomeCheckBox(){
        getDriver().findElement(selectHomeBox).click();
    }


    public void clickExpandButton(){
        getDriver().findElement(expand).click();
    }

    public boolean resultMessage(){
        return getDriver().findElement(message).isDisplayed();
    }
}



