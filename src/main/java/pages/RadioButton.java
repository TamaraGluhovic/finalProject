package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter public class RadioButton extends BasePage {


    private By chooseRadioButtonField = By.id("item-2");
    private By yesRadio = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveRadio = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By noRadio = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label");
    private By afterClickMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");


    private By textSuccess = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span");


    public RadioButton(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public void clickRadioButtonField() {
        getDriver().findElement(chooseRadioButtonField).click();
    }

    public void selectYesRadio() {
        getDriver().findElement(yesRadio).click();
    }

    public String radioButtonMessage() {
        return getDriver().findElement(afterClickMessage).getText();
    }

    public void selectImpressiveRadio() {
        getDriver().findElement(impressiveRadio).click();
    }


    public boolean radioButtonNoIsEnabled() {
        return !getDriver().findElement(noRadio).isEnabled();
    }

    public boolean isYesButtonSelected() {
        return getDriver().findElement(yesRadio).isSelected();
    }

    public boolean isImpressiveButtonSelected() {
        return getDriver().findElement(impressiveRadio).isSelected();
    }





}
