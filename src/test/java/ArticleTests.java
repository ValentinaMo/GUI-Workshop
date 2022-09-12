import org.testng.annotations.Test;
import pages.SearchPage;
import pages.MainPage;
import static org.testng.AssertJUnit.assertTrue;

public class ArticleTests extends Hooks{
    @Test
    public void searchArticle(){
        MainPage mainPage = new MainPage(driver);
        mainPage.searchAnArticle("Alexa");
        SearchPage articlePage = new SearchPage(driver);
        Boolean asd = articlePage.getFirstArticleName().contains("Alexa");
        assertTrue("The first item does not match with the search word",
                articlePage.getFirstArticleName().contains("alexa"));

    }

    @Test
    public void searchArticle2(){
        MainPage mainPage = new MainPage(driver);
        SearchPage articlePage = mainPage.searchAnArticle("Alexa");
        assertTrue("The first item does not match with the search word",
                articlePage.getFirstArticleName().contains("alexa"));

    }
}
