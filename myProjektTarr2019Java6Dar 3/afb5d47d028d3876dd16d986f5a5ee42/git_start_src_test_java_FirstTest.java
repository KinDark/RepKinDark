import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org. openqa.selenium.support.wi.WebDriverWait;

public class FirstTest {
    @Test
    public void demoTest(){
        System.setProperty("webdriver.chrome.driv","src/main/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver ();
        driver.manage().windows().setSize(new Dimension(1295,730));


        driver.navigate().to("https//google.pl");
        WebElement searchEntry ="Wieloświat-Wikipedia, wolna encyklopedia";

        serchField.sendKeys(searchEntry);
        serchFiels.submit();
        driver.findElement(By.xpath(".//*[text()='"+ title+"']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExectedConditions, titleIs(title));

        String entryURL = "https://pl.wikipedia.org/wiki/Wielo%C5%
        Assertions.assertEquals(entryURL, driver..getCurrentUrl(), "URL is not correct.");

        driver.quit();
    }

}
