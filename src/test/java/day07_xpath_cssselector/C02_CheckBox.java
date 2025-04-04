package day07_xpath_cssselector;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CheckBox {

    // Go to the given web page. https://the-internet.herokuapp.com/checkboxes
    // Locate checkbox1 and checkbox2 elements.
    // If Checkbox1 is not selected, click the checkbox
    // If Checkbox2 is not selected, click the checkbox
    // Close the page

    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
        // Checkbox1 ve checkbox2 elementlerini locate edin.
        // Checkbox1 seçili değilse onay kutusunu tıklayın
        // Checkbox2 seçili değilse onay kutusunu tıklayın
        // Sayfayi kapatin

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        Thread.sleep(3000);
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
        Thread.sleep(3000);

        //driver.quit();

    }


}