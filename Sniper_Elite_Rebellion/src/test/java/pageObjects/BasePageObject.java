package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class BasePageObject{
    private WebDriver driver;
    private WebDriverWait wait;


    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));

    }

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        BasePageObject basePage = new BasePageObject(driver);

    }
    public WebElement waitForanElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}



