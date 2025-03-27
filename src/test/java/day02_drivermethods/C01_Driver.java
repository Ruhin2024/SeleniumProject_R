package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_Driver {
    public static void main(String[] args) {

        /*
         WebDriverManager.chromedriver().setup(); bu kod sayesinde istedigimiz browser otomasyonu icin driveri setup yaparak
         otomasyonda kullanabiliriz, bu sayede browsera göre gerekli versiyon ve dirveri bilgisayarimiza indirmek, yapilandirmak(System.setproperty..)
         zorunda kalmayiz
         */


        WebDriverManager.chromedriver().setup();
        //Bos bir chrome browseri acar
        WebDriver chromeDriver = new ChromeDriver();

        //gidilmek istenen url get method parantezi icinde belirtilir
        chromeDriver.get("https://google.com");

        //acik olan tüm sekme ve sayfalari kapatir ve driver oturumunu sonlandirir
        chromeDriver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.quit();

        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://google.com");
        edgeDriver.quit();

    }
}
