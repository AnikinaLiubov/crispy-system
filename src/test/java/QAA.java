import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class QAA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
        String expectedYear = "1988";
        String expectedDirector = "John McTiernan";

        driver.get("file:///C:/xampp/htdocs/index.html");


        WebElement movieSearch = driver.findElement(By.id("film_name"));
        WebElement searchBtn = driver.findElement(By.id("get_api_res_btn"));
        //WebElement directorName = driver.findElement(By.id("api_director"));

        movieSearch.sendKeys("Die Hard");
        searchBtn.click();

        WebElement directorName = new WebDriverWait(driver, Duration.ofSeconds(30)).until(elementToBeClickable(By.id("api_director")));

        System.out.println("Director's Name:" + directorName.getText().substring(10));

        Assert.assertEquals(directorName.getText().substring(10), expectedDirector);
        //Assert.assertEquals(directorName.getText().substring(10), expectedDirector);

    }
}