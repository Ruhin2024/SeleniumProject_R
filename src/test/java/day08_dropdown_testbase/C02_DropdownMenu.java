package day08_dropdown_testbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DropdownMenu {
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
    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        // 2.Method:
        // a. Tüm eyalet isimlerini yazdıralım
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement states = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(states);
        List<WebElement> eyaletlerListesi = select.getOptions();
//        for( WebElement w : eyaletlerListesi){
//            System.out.println(w.getText());
//        }
        //ikinci yol
        eyaletlerListesi.forEach(t -> System.out.println(t.getText()));
    }

    @Test
    public void test02() {
        // 2.Method:
        // a. Tüm eyalet isimlerini yazdıralım
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        List<WebElement> eyaletlerListesi = driver.findElements(By.xpath("//select[@id='state']/option"));
        eyaletlerListesi.forEach(t -> System.out.println(t.getText()));
    }


    @Test
    public void test03() {
        //NOT =>     7- Coguzaman dropdown webelementine sendKeys() methodu kullanarak alt basliklardaki herhangi bir seceneği göndererek secim yapabiliriz

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        // 1.Method:
        // a. Yil,ay,gün dropdown menu'leri locate ediniz
        driver.findElement(By.id("year")).sendKeys("2020");
        driver.findElement(By.id("month")).sendKeys("May");
        driver.findElement(By.id("day")).sendKeys("19");

    }

    @Test
    public void test04() {
        //3.Method:
        // a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement states = driver.findElement(By.cssSelector("#state"));

        Select select = new Select(states);

        String expectedOption = "Select a State";
        String actualOption = select.getFirstSelectedOption().getText();//Select a State

        Assertions.assertEquals(expectedOption,actualOption);


    }
}