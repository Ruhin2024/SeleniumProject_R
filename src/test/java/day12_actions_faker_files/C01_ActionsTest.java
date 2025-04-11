package day12_actions_faker_files;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;

public class C01_ActionsTest extends TestBase {
    /*
    ÖDEV : Drag webelementinin drop webelementinin üzerine bırakıldığını test edin
     */

    //Go to https://jqueryui.com/droppable/
    //Drag me to my target webelement onto the Drop here webelement


    @Test
    public void dragAndDrop() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        //Drag me to my target webelementini Drop here webelementi üzerine bırakalım
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).perform();//drag webelementini drop webelementinin üzerine birakir
    }

    @Test
    public void dragAndDrop2() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions
                .clickAndHold(drag)//drag webelementine tiklar ve basili tutar
                .moveToElement(drop)//drag webelementini tutup drop webelementinin üzerine götürür
                .pause(Duration.ofSeconds(3))//belirtilen süre kadar bekletir
                .release()//basili tutulan webelementi serbest birakir
                .perform();

    }

    @Test
    public void dragAndDrop3() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions
                .clickAndHold(drag)
                .moveByOffset(139,1)
                .release()
                .perform();
    }



}