package testing;

import pages.*;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

@Getter public abstract class BaseTest {

    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private HomeElements homeElements;
    private TextBox textBox;
    private CheckBox checkBox;
    private RadioButton radioButton;
    private WebTables webTables;
    private Buttons buttons;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamara\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        this.homeElements = new HomeElements(driver, driverWait);
        this.textBox = new TextBox(driver, driverWait);
        this.checkBox = new CheckBox(driver, driverWait);
        this.radioButton = new RadioButton(driver, driverWait);
        this.webTables = new WebTables(driver, driverWait);
        this.buttons = new Buttons(driver, driverWait);
        this.homePage = new HomePage(driver, driverWait);
    }

/*
 @AfterClass
    public void afterClass(){
        driver.close();
    }



*/
}
