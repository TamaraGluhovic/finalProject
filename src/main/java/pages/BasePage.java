package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

   @Getter public abstract class BasePage {

        private WebDriver driver;
        private WebDriverWait driverWait;

        private static final String HOME_URL = "https://demoqa.com/";
        private static final String ELEMENTS_URL = "https://demoqa.com/elements";


        public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public void elementsUrl(){
            getDriver().navigate().to(ELEMENTS_URL);
    }



       public void waiterForElementToBeClickable(By locator){
           getDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
       }

       public void jsExecutorScroll(){
           JavascriptExecutor js = (JavascriptExecutor) getDriver();
           js.executeScript("window.scrollBy(0,550)", "");

       }



   }

