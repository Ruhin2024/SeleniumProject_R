package day06_webelements_xpath;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0603_R {

    @Test
    public void test1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //go to the web page. https://www.amazon.com/
        //Search "city bike" in the search box (locate the search box with xpath)
        //Print the number of relevant results displayed on Amazon
        //Just print the result number
        //Then click on the text of the first result that appears.
        //close the page

        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.xpath("//*[@*='text']"));
        searchBox.sendKeys("city bike");
        searchBox.submit();

        WebElement resultText = driver.findElement(By.xpath("//div[@class='sg-col-inner'][1]"));
        System.out.println(resultText.getText());

        String resultNumberText = resultText.getText().split(" ")[3];
        System.out.println(resultNumberText);

        driver.findElement(By.xpath("(//a/h2)[1]")).click();

        driver.quit();
    }

    @Test
    public void test2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //go to the web page. https://www.amazon.com/
        //Search "city bike" in the search box (locate the search box with xpath)
        //Print the number of relevant results displayed on Amazon
        //Just print the result number
        //Then click on the text of the first result that appears.
        //close the page

        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("city bike");
        searchBox.submit();

        WebElement resultText = driver.findElement(By.xpath("//div[@class='sg-col-inner'][1]"));
        System.out.println(resultText.getText());

        String resultNumberText = resultText.getText().split(" ")[3];
        System.out.println(resultNumberText);

        driver.findElement(By.xpath("(//a/h2)[1]")).click();
        driver.quit();


    }
}
