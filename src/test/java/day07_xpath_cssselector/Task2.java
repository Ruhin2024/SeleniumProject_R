package day07_xpath_cssselector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task2 {

   /* HOMEWORK
    https://www.calculator.net/
    Bir tane class olusturun
    SETUP VE TEARDOWN methodlarini olusturun
    4 ayri test methodu olusturarak 4 islemin beklendigi gibi calistigini test edin
    (örneğin toplama islemi testi icin bir method, cikarma icin baska bir test methodu gibi..)*/

    public class CalculatorTestsHomeWork {
        private WebDriver driver;

        @BeforeEach
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @Test
        public void addition() {
            driver.get("https://www.calculator.net/");

            WebElement one = driver.findElement(By.xpath("//span[.='1']"));
            one.click();

            WebElement plus = driver.findElement(By.xpath("//span[.='+']"));
            plus.click();

            WebElement five = driver.findElement(By.xpath("//span[.='5']"));
            five.click();

            WebElement equal = driver.findElement(By.xpath("//span[.='=']"));
            equal.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Test
        public void subtraction() {
            driver.get("https://www.calculator.net/");

            WebElement one = driver.findElement(By.xpath("//span[.='1']"));
            one.click();

            WebElement minus = driver.findElement(By.xpath("//span[.='–']"));
            minus.click();

            WebElement five = driver.findElement(By.xpath("//span[.='5']"));
            five.click();

            WebElement equal = driver.findElement(By.xpath("//span[.='=']"));
            equal.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Test
        public void division() {
            driver.get("https://www.calculator.net/");

            WebElement one = driver.findElement(By.xpath("//span[.='1']"));
            one.click();

            WebElement divide = driver.findElement(By.xpath("//span[.='/']"));
            divide.click();

            WebElement five = driver.findElement(By.xpath("//span[.='5']"));
            five.click();

            WebElement equal = driver.findElement(By.xpath("//span[.='=']"));
            equal.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Test
        public void multiplication() {
            driver.get("https://www.calculator.net/");

            WebElement one = driver.findElement(By.xpath("//span[.='1']"));
            one.click();

            WebElement multiply = driver.findElement(By.xpath("//span[.='×']"));
            multiply.click();

            WebElement five = driver.findElement(By.xpath("//span[.='5']"));
            five.click();

            WebElement equal = driver.findElement(By.xpath("//span[.='=']"));
            equal.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }
    }

}
