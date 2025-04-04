package day05_webelements_locators;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice1_R {

@Test
    public void practiceLocator1() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://amazon.com");
    Thread.sleep(3000);

    //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
    /* 1 yol
    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    searchBox.sendKeys("iphone");
    searchBox.submit();*/

    //2 yol
    // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

    driver.findElement(By.name("field-keywords")).sendKeys("iphone",Keys.ENTER);

}





}
