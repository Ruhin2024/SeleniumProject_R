package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice01_d2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        chromeDriver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver edgedriver = new EdgeDriver();
        edgedriver.get("https://google.com");
        edgedriver.quit();

        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get("https://google.com");
        firefoxdriver.quit();

    }
}
