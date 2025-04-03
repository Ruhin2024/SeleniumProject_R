package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Locators {

    // Let's go to the YouTube page
    // Find the search box by its "name" attribute and type "selenium"
    // Perform the search
    // Test if the page title contains "selenium"
    // Print the number of links on the page
    // Print the text of the links on the page to the console if they have text
    // Close the page

    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // youtube sayfasına gidelim
        driver.get("https://youtube.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Arama kutusunu "name" attribute e göre bularak "selenium" yazalim
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("selenium");

        // Aramayı yapalim
        searchBox.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Sayfa başlığının selenium içerdiğini test edelim
        Assertions.assertTrue(driver.getTitle().contains("selenium"));

        // Sayfada kaç tane link olduğunu yazdıralım
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi ==> " + links.size());

        // Sayfadaki linklerin metinleri varsa konsola yazdıralım
        for(WebElement w : links){
            System.out.println(w.getText());
        }
        /*
        Eger birden fazla weblementi secmek istiyorsak o zaman driver.findElements()
        methodunu kullanmaliyiz, bu method bize elemanlari webelement olan birlist verir
        getText() methodu bir webelemente ait yaziyi alabilmek icin kullanilir
         */

        // sayfayı kapatalım
        driver.quit();

    }
}