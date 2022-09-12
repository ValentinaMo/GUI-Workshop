package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage extends BasePage{
    private WebDriver driver;

    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']/child::span[2]")
    private WebElement firstArticleTitle;
    //FindBy will look for the element only when it is used while findElement will
    // look for an element as soon as you call it.

//    public ArticlePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this); //Inicializando los webElements
//        //If we do not initialise page objects using PageFactory, @FindBy will throw NullPointerException
//        // which is not the case with findElement() or findElements() methods.
//    }


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstArticleName(){
        return firstArticleTitle.getText();
    }
}
