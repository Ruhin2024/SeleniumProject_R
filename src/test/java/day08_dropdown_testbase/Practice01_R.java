package day08_dropdown_testbase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Practice01_R {

      WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test1()  {

            /*
   Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
   -3 farklı test methodu oluşturalım
       1.Method:
           a. Yil,ay,gün dropdown menu'leri locate ediniz
           b. Select objesi olustur
           c. Select object i kullaarak 3 farkli sekilde secim yapiniz
       2.Method:
           a. Tüm eyalet isimlerini yazdıralım
       3.Method:
           a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
    */

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        Select selectYear = new Select(year);
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

        selectYear.selectByIndex(1);
        selectMonth.selectByValue("7");
        selectDay.selectByVisibleText("25");

    }
}
