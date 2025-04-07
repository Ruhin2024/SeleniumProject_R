package day08_dropdown_testbase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01_DropdownMenu {
    /*
    Dropdown u automate etmek icin;
    1- Dropdown webelementini locate etmek
    2- Select objecti olusturulur
    3- Select objecti üzerinden cesitli methodlar kullanarak dropdown menuden secim yapabiliriz

    SYNTAX;
    Select select = new Select(Dropdown webelementi);

    4-Select objecti üzerinden DDM yü handle edebileceğimiz 3 tane method vardir.
        a) selectByVisibleText()->DDM deki webelementi görünür metin üzerinden secmek icin kullanilir
        b) selectByIndex()-> DDM deki webelementi index ile secmek icin kullanilir
        c) selectByValue()-> option tagi ile baslayan seceneklerdeki value attribute degerine göre secmek icin kullanilir

    5- getOptions() -> Dropdown menudeki tum secenekleri list icinde verir
    6- getFirstSelectedOption() -> Dropdown menudeki secili olan seceneği bize verir
     */

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
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

       WebElement year = driver.findElement(By.id("year"));
       WebElement month = driver.findElement(By.id("month"));
       WebElement day = driver.findElement(By.id("day"));
        Select secletYear = new Select(year);
        Select seclectMonth = new Select(month);
        Select selectDay = new Select(day);
        secletYear.selectByIndex(0);
        //seclectMonth.selectByIndex(0); //index 0 dan baslar yeni 0 yazdigimizda 1 ci secenek (optin) secilir
       // selectDay.selectByIndex(1);

        seclectMonth.selectByValue("3");//<option value="4">May</option>
        selectDay.selectByVisibleText("7");//<option value="7">7</option>
    }

}