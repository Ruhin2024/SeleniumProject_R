package Project_Ruhin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice02_d3_R {
    public static void main(String[] args) throws InterruptedException {

        //Go to TechPro page. https://www.techproeducation.com/
        //Print the page position and size
        //Minimize the page
        //Wait 3 seconds in minimized mode and maximize the page
        //Print the page position and size in maximized mode
        //Make the page fullscreen
        //Print the page position and size in fullscreen mode
        //Close the page


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com/");
        System.out.println("Sayfanin yeri =>" + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyukluyu =>" + driver.manage().window().getSize());
        //-----------------------------
        driver.manage().window().minimize();
       Thread.sleep(15000);
       System.out.println("Sayfanin yeri =>" + driver.manage().window().getPosition());
       System.out.println("Sayfanin boyukluyu =>" + driver.manage().window().getSize());
       //---------------------------------
       driver.manage().window().fullscreen();
       Thread.sleep(15000);
       System.out.println("Sayfanin yeri =>" + driver.manage().window().getPosition());
       System.out.println("Sayfanin boyukluyu =>" + driver.manage().window().getSize());

       Thread.sleep(15000);
       driver.quit();



    }
}
