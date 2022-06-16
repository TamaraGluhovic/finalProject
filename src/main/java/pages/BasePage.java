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
        private static final String TEXT_BOX_URL = "https://demoqa.com/text-box";
        private static final String CHECK_BOX_URL = "https://demoqa.com/checkbox";
        private static final String RADIO_BUTTON_URL = "https://demoqa.com/radio-button";
        private static final String WEB_TABLES_URL = "https://demoqa.com/webtables";
        private static final String BUTTONS_URL = "https://demoqa.com/buttons";


        public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public void elementsUrl(){
            getDriver().navigate().to(ELEMENTS_URL);
    }

           public void textBoxUrl(){
           getDriver().navigate().to(TEXT_BOX_URL);
       }

       public void checkBoxUrl(){
           getDriver().navigate().to(CHECK_BOX_URL);
       }

       public void radioButtonUrl(){
           getDriver().navigate().to(RADIO_BUTTON_URL);
       }

       public void webTablesUrl(){
           getDriver().navigate().to(WEB_TABLES_URL);
       }
       public void buttonsUrl(){
           getDriver().navigate().to(BUTTONS_URL);
       }


       public void waiterForElementToBeClickable(By locator){
           getDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
       }

       public void jsExecutorScroll(){
           JavascriptExecutor js = (JavascriptExecutor) getDriver();
           js.executeScript("window.scrollBy(0,550)", "");

       }



   }

