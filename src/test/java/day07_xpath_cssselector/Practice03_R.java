package day07_xpath_cssselector;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice03_R {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //Click the “Create an Account” button
        driver.findElement(By.xpath("//a[@role='button'][1]")).click();
        Thread.sleep(3000);

        //locate “radio buttons” elements
        WebElement female = driver.findElement(By.xpath("//label[@class='_58mt'][1]"));
        WebElement male = driver.findElement(By.xpath("//label[@class='_58mt'][2]"));
        //choose the one that suits you from the gender button.
        Thread.sleep(3000);
        male.click();

        Thread.sleep(3000);
        female.click();

        Thread.sleep(3000);
        male.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
