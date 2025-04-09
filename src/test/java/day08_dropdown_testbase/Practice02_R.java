package day08_dropdown_testbase;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Practice02_R {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test1() {
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

        WebElement states = driver.findElement(By.cssSelector("select[id='state']"));
        Select select =new Select(states);
        List<WebElement> statesList = select.getOptions();

        /* for (WebElement w : statesList){
            System.out.println(w.getText());
        } */
        statesList.forEach(t -> System.out.println(t.getText()));
    }

    @Test
    public void test2() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        List<WebElement> statesList = driver.findElements(By.xpath("//select[@id='state']/option"));
        statesList.forEach(t-> System.out.println(t.getText()));
    }

    @Test
    public void test3() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        driver.findElement(By.id("year")).sendKeys("2024");
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.id("day")).sendKeys("25");
    }

    @Test
    public void test4() {
        /*3.Method:
          a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim*/

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement state = driver.findElement(By.cssSelector("#state"));

        Select select = new Select(state);
        String expectedOption = "Select a State";
        String actualOption = select.getFirstSelectedOption().getText();
        Assertions.assertEquals(expectedOption,actualOption);
    }

    @Test
    public void test5() {
        /*3.Method:
          a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim*/

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement state = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(state);
        String expectedOption = "Select a State";
        String actualOption = select.getFirstSelectedOption().getText();
        Assertions.assertEquals(expectedOption,actualOption);
    }

    @AfterEach
    void tearDown() {
        //driver.quit();
    }
}
