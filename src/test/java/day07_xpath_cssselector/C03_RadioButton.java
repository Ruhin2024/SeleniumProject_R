package day07_xpath_cssselector;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButton {


    // Go to https://www.facebook.com
    //Click the "Create an Account" button
    //locate "radio buttons" elements
    //choose the one that suits you from the gender button.


    @Test
    public void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  https://www.facebook.com adresine gidin
        //  "Create an Account" button'una basin
        //  "radio buttons" elementlerini locate edin
        //   cinsiyet butonundan size uygun olani secin

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        WebElement female = driver.findElement(By.xpath("//input[@value='1']"));

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