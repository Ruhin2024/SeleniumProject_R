package Project_Ruhin;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice01_d3_R {
    public static void main(String[] args) {

        // go to techproeducation homepage https://www.techproeducation.com/
        //Go to Amazon page. https://www.amazon.com/
        //Go back to techproeducation page
        //Go to Amazon page again
        //Refresh the page
        //Close all pages

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techproeducation.com/");

        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
    @Test
    public void test() {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver1.navigate().to("https://www.web.de/");
        driver1.navigate().to("https://www.github.com");
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().refresh();
        driver1.quit();
    }



}
