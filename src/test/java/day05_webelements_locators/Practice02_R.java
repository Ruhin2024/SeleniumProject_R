package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practice02_R {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Let's go to the YouTube page
        // Find the search box by its "name" attribute and type "selenium"
        // Perform the search
        // Test if the page title contains "selenium"
        // Print the number of links on the page
        // Print the text of the links on the page to the console if they have text
        // Close the page

        driver.get("https://youtube.com");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("selenium");

        searchBox.submit();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        Assertions.assertTrue(driver.getTitle().contains("selenium"));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayini" + links.size());

        for (WebElement w : links){
            System.out.println(w.getText());
        }
        driver.quit();


    }


}
