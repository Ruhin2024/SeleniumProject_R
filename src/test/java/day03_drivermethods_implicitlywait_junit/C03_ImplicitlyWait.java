package day03_drivermethods_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ImplicitlyWait {

    /*
    Bir websayfasindaki webelementlerin yüklenmesi icin bir süreye ihtiyac vardir,
    (Server kaynakli, sayfa yük altinda olabiir, internet hizimiz yavas olabilir...)
    Dolayisisyla islem yapilmak istenen webelement henüz yüklenmediyse yazdigimiz kodlarimiz bu elementi
    bulamayacak  ve kodumuz hata verecektir. Bu yüzden Implicitly wait kullanarak webelementlerin yüklenmesini
    belirteceğimiz maximum süre icin ayarlariz.
    Bu implicitly wait isimizin %80 ini cözer kalan kısım icin ilerleyen derslerimizde selenium waits  explicit waits konusunda
    göreceğiz
     */

    //Go to TechProEducation page
    //test that the page title contains TechPro Education
    //go to facebook page
    //test that the page url contains facebook
    //go back to techpro page
    //Test that you are back
    //close the page
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");

        //sayfa başlığının TechPro Education içerdiğini test ediniz
        System.out.println("Title = " +  driver.getTitle());
        if (driver.getTitle().contains("TechPro Education")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");

        //sayfa url'inin facebook içerdiğini test ediniz
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        //techpro sayfasına geri dönününüz
        driver.navigate().back();

        //Geri döndüğünüzü test ediniz

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.techproeducation.com/")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        //sayfayı kapatınız
        driver.quit();
    }


}