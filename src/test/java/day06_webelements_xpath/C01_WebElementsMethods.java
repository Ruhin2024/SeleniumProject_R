package day06_webelements_xpath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementsMethods {


    //test01
//go to techproeducation page
//test that the tag name of the search box is input
//test that the class attribute value of the search box is form-input

//test02
//go to amazon site
//type qa in the search box
//test that qa can be successfully typed in the search box
//close the page

    @Test
    public void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //arama kutusunun tag name'inin input olduğunu test edelim

        /*
        <input id="searchHeaderInput" type="text" class="form-input" placeholder="Search Program">
         */
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName ="input";
        String actualTagName =searchBox.getTagName();
        Assertions.assertEquals(expectedTagName,actualTagName);

        //arama kutusunun class attribütunun değerinin form-input olduğunu test ediniz
        String expectedAttributeValue = "form-input";
        String actualAttributeValue = searchBox.getDomAttribute("class");
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);

        driver.quit();
    }

    @Test
    public void test02() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sitesine gidin
        driver.get("https://amazon.com");

        //--------captcha yi handle etmek icin yazildi--------
        driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(3000);
        //--------captcha yi handle etmek icin yazildi--------

        //arama kutusunda qa yazin
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("qa");

        //arama kutusunda basarili bir sekilde qa yazilabildigini test edin
        String actualValue = searchBox.getDomProperty("value");
        Assertions.assertEquals("qa",actualValue);

        //sayfayı kapatınız
        //driver.quit();
    }


}