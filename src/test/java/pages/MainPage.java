package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    WebDriver driver;
    private By searchBar = By.cssSelector(".gh-tb.ui-autocomplete-input");
    private By searchButton = By.id("gh-btn");

    //Inicializar el objeto
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage searchAnArticle(String article){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(searchBar).sendKeys(article);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }

}
