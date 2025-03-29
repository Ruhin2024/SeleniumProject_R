
package day04_junit_webelements;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_AssertionsTest {


    // Go to Google Website
    //Verify that the page title is Google
    // Close the page

    // Go to Google Website
    // Verify that the page url is https://www.google.com/
    // Close the page

static WebDriver driver;
    @BeforeEach
    void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void googleTitleTest() {
        // Google Web sitesine gidin
        driver.get("https://google.com");

        // Sayfa basliginin Google oldugunu dogrulayin
        String expectedData = "Google";
        String actualData = driver.getTitle();
        Assertions.assertEquals(expectedData,actualData);

        // Sayfayi kapatin

    }

    @Test
    public void googleUrlTest() {

        // Google Web sitesine gidin
        driver.get("https://google.com");

        // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
        String expectedData = "https://www.google.com/";
        String actualData = driver.getCurrentUrl();
        Assertions.assertEquals(expectedData,actualData);

        // Sayfayi kapatin

    }

    @AfterEach
    static void treadDown() {
        driver.quit();
    }

}