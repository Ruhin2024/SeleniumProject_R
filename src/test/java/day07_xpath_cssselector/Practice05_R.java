package day07_xpath_cssselector;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Practice05_R {

    // Go to https://www.calculator.net/
    // Locate button '1'
    // Find button '0' using Relative Locator (below '1')
    // Find button '2' using Relative Locator (right of '1')
    // Find button '3' using Relative Locator (right of '2')
    // Find button '4' using Relative Locator (above '1')
    // Find button '5' using Relative Locator (right of '4')
    // Find button '6' using Relative Locator (right of '5')
    // Find button '7' using Relative Locator (above '4')
    // Find button '8' using Relative Locator (right of '7', above 5)
    // Find button '9' using Relative Locator (right of '8', above 6)
    // Find the result row using Relative Locator (above '7,8,9', )
    // Click each button
    // Print result
    // Close browser

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.calculator.net/ adresine gidin
        driver.get("https://www.calculator.net/");
        // '1' düğmesini locate etme
        WebElement one = driver.findElement(By.xpath("//span[.='1']"));
        // Relative Locator kullanarak '0' düğmesini bul ('1'in altında)
        WebElement zero = driver.findElement(RelativeLocator.with(By.tagName("span")).below(one));
        // Relative Locator kullanarak '2' düğmesini bul ('1'in sağında)
        WebElement two = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(one));
        // Relative Locator kullanarak '3' düğmesini bul ('2'nin sağında)
        WebElement three = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(two));
        // Relative Locator kullanarak '4' düğmesini bul ('1'in üstünde)
        WebElement four = driver.findElement(RelativeLocator.with(By.tagName("span")).above(one));
        // Relative Locator kullanarak '5' düğmesini bul ('4'ün sağında)
        WebElement five = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(four));
        // Relative Locator kullanarak '6' düğmesini bul ('5'in sağında)
        WebElement six = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(five));
        // Relative Locator kullanarak '7' düğmesini bul ('4'ün üstünde)
        WebElement seven =driver.findElement(RelativeLocator.with(By.tagName("span")).above(four));
        // Relative Locator kullanarak '8' düğmesini bul ('7'nin sağında, 5'in üzerinde)
        WebElement eight = driver.findElement(RelativeLocator.with(By.tagName("span")).above(five));
        // Relative Locator kullanarak '9' düğmesini bul ('8'in sağında, 6'nın üzerinde)
        WebElement nine = driver.findElement(RelativeLocator.with(By.tagName("span")).above(six));
        // Relative Locator kullanarak sonuç satırını bul ('7,8,9'un üzerinde, )
        WebElement result = driver.findElement(RelativeLocator.with(By.tagName("div")).above(nine).above(eight).above(seven));

        one.click();
        Thread.sleep(1000);
        two.click();
        Thread.sleep(1000);
        three.click();
        Thread.sleep(1000);
        four.click();
        Thread.sleep(1000);
        five.click();
        Thread.sleep(1000);
        six.click();
        Thread.sleep(1000);
        seven.click();
        Thread.sleep(1000);
        eight.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000);

        System.out.println(result.getText());
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.calculator.net/ adresine gidin
        driver.get("https://www.calculator.net/");

        WebElement one = driver.findElement(By.xpath("//span[.='1']"));
        WebElement zero = driver.findElement(RelativeLocator.with(By.tagName("span")).below(one));
        WebElement two = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(one));
        WebElement three = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(two));
        WebElement four = driver.findElement(RelativeLocator.with(By.tagName("span")).above(one));
        WebElement five = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(four));
        WebElement six = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(five));
        WebElement seven = driver.findElement(RelativeLocator.with(By.tagName("span")).above(four));
        WebElement eight = driver.findElement(RelativeLocator.with(By.tagName("span")).above(five));
        WebElement nine = driver.findElement(RelativeLocator.with(By.tagName("span")).above(six));
        WebElement resul = driver.findElement(RelativeLocator.with(By.tagName("div")).above(nine).above(eight).above(seven));

        zero.click();
        Thread.sleep(1000);
        one.click();
        Thread.sleep(1000);
        two.click();
        Thread.sleep(1000);
        three.click();
        Thread.sleep(1000);
        four.click();
        Thread.sleep(1000);
        five.click();
        Thread.sleep(1000);
        six.click();
        Thread.sleep(1000);
        seven.click();
        Thread.sleep(1000);
        eight.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000);

        System.out.println(resul.getText());
        driver.quit();

    }
}
