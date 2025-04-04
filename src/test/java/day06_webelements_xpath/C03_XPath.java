package day06_webelements_xpath;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPath {

    /*
    /  -> Bir alt childi secer
    // -> Sayfadaki herhangi bir webelementi secer  //div
    @  -> Bir webelementin attribute unu secmek icin kullanilir
    [] -> Index veya kosul belirtmek icin kullanilir
    *  -> Herhangi bir webelementi secer

    SYNTAX:
    //tagName[@attribute ismi = 'attribute degeri']
    //*[@* = 'attribute degeri']
    (//tagName[@attribute ismi = 'attribute degeri'])[index]
     */

    //go to the web page. https://www.amazon.com/
    //Search "city bike" in the search box (locate the search box with xpath)
    //Print the number of relevant results displayed on Amazon
    //Just print the result number
    //Then click on the text of the first result that appears.
    //close the page

    @Test
    public void test01() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //yazildi--------
        driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(3000);
        //--------captcha yi handle etmek icin yazildi--------

        //Arama kutusunda "city bike" aratin (arama kutusunu xpath ile locate edin)
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("city bike");
        searchBox.submit();

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın  (//tagName[@attribute ismi = 'attribute degeri'])[index]
       WebElement resultText = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

       System.out.println(resultText.getText()); //1-16 of over 6,000 results for "city bike"

        //Sadece sonuc sayısını yazdırınız
        String resultNumberText = resultText.getText().split(" ")[3];
        System.out.println(resultNumberText); //6,000


        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        driver.findElement(By.xpath("(//a/h2)[1]")).click();


        //sayfayi kapatınız
        driver.quit();
    }
}