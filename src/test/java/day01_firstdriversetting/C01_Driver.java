package day01_firstdriversetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {

    public static void main(String[] args) {
        /*
        ChromeDriver, selenium dan gelen komutlari alir ve bu komutlari Chrome browser in
        anlayabileceği sekilede cevirir, bunun icin java dan  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        kodu ile selenium a ChromeDriver in konumunu bildirerek chrome browserin doğru bir seklide
        baslatilmasini sagliyoruz
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

    }



}