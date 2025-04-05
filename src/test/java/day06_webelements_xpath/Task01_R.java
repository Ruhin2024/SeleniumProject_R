package day06_webelements_xpath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task01_R {

       /* Yeni bir class olusturalim (Homework)
         ChromeDriver kullanarak,

        facebook sayfasina gidin
        sayfa basliginin (title) "Facebook" icerdigini dogrulayin ,
        Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin,

        https://testcenter.techproeducation.com/ sayfasina gidin.
        Sayfa headerinin "Automation Engineer" icerdigini dogrulayin.
        Sayfa URL'inin "techproeducation" kelimesi icerdigini dogrulayin,
        "Back to TechProEducation.com" butonunun görüntülendigini doğrulayin
        "Back to TechProEducation.com" butonunun üzerindeki yazinin  TechProEducation icerdigini doğrulayin
        Tekrar "facebook" sayfasina donun
        Geri döndüğünüzü doğrulayin.
        Sayfayi kapatin */

    @Test
    public void task1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //facebook sayfasina gidin
        //sayfa basliginin (title) "Facebook" icerdigini->(contains) dogrulayin,
        //Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin,

        driver.get("https://facebook.com");
        Assertions.assertTrue(driver.getTitle().contains("Facebook"));
        driver.getCurrentUrl().contains("facebook");
        Assertions.assertTrue(driver.getCurrentUrl().contains("facebook"));

        /*https://testcenter.techproeducation.com/ sayfasina gidin.
        Sayfa headerinin "Automation Engineer" icerdigini dogrulayin.
        Sayfa URL'inin "techproeducation" kelimesi icerdigini dogrulayin,
        "Back to TechProEducation.com" butonunun görüntülendigini doğrulayin
        "Back to TechProEducation.com" butonunun üzerindeki yazinin  TechProEducation icerdigini doğrulayin
        Tekrar "facebook" sayfasina donun
        Geri döndüğünüzü doğrulayin.
        Sayfayi kapatin */

        driver.get("https://testcenter.techproeducation.com");
        Assertions.assertTrue(driver.getTitle().contains("Automation Engineer"));
        driver.getCurrentUrl().contains("techproeducation");
        Assertions.assertTrue(driver.getCurrentUrl().contains("techproeducation"));
        driver.findElement(By.partialLinkText("Back to TechProEducation.com")).isDisplayed();
        Assertions.assertTrue(driver.findElement(By.partialLinkText("Back to TechProEducation.com")).isDisplayed());
        driver.findElement(By.partialLinkText("Back to TechProEducation.com")).getText().contains("TechProEducation");
        Assertions.assertTrue(driver.findElement(By.partialLinkText("Back to TechProEducation.com")).getText().contains("TechProEducation"));
        driver.navigate().back();
        Assertions.assertTrue(driver.getCurrentUrl().contains("https://facebook.com"));
        driver.quit();
    }
}
