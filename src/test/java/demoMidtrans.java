import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoMidtrans {
    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigate to URL
        driver.get("https://demo.midtrans.com/");

        //Locating elements
        WebElement elementBuy = driver.findElement(By.cssSelector(".btn.buy"));
        WebElement elementName = driver.findElement(By.xpath("//input[@value='Budi']"));
        WebElement elementEmail = driver.findElement(By.xpath("//input[@value='budi@utomo.com']"));
        WebElement elementPhone = driver.findElement(By.xpath("//input[@value='081808466410']"));

        //Functions or methods
        elementBuy.click();

        elementName.clear();
        elementName.sendKeys("Lulu");
        Thread.sleep(2000);

        elementEmail.clear();
        elementEmail.sendKeys("luluqorriaina@gmail.com");
        Thread.sleep(2000);


        elementPhone.clear();
        elementPhone.sendKeys("08123456789");
        Thread.sleep(2000);

        driver.quit();

    }
}