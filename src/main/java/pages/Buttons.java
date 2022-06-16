package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter public class Buttons extends BasePage{

    private By chooseButtonsField = By.xpath("//*[@id=\"item-4\"]");
    private By doubleClickButton = By.id("doubleClickBtn");
    private By rightClickButton = By.id("rightClickBtn");
    private By dynamicClickButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");

    private By messageForDoubleClick = By.id("doubleClickMessage");
    private By messageForRightClick = By.id("rightClickMessage");
    private By messageForDynamicClick = By.id("dynamicClickMessage");

    public Buttons(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public void clickButtonsField(){
        getDriver().findElement(chooseButtonsField).click();
    }

    public void performDoubleClick(){
        Actions actions = new Actions(getDriver());
        WebElement element = getDriver().findElement(doubleClickButton);
        actions.doubleClick(element).perform();
    }

    public void performRightClick(){
        Actions actions = new Actions(getDriver());
        WebElement el = getDriver().findElement(rightClickButton);
        actions.contextClick(el).perform();
    }

    public void performDynamicClick(){
        Actions actions = new Actions(getDriver());
        WebElement element = getDriver().findElement(dynamicClickButton);
        actions.click(element).perform();
    }


    public String confirmDoubleClick(){
        return getDriver().findElement(messageForDoubleClick).getText();
    }

    public String confirmRightClick(){
        return getDriver().findElement(messageForRightClick).getText();
    }

    public String confirmDynamicClick(){
        return getDriver().findElement(messageForDynamicClick).getText();
    }


}
