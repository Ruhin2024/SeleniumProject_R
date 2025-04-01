package day04_junit_webelements;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01_R {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll notasyonuna mailk bir method butun test methodlarindan evvel bir defe calisir");
    }

    @BeforeEach
    void setUp(){
        System.out.println("@BeforeEach notasyonuna mailk bir method her test methodunden sonra sadece bir defe calisir");
    }

    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }

    @Test
    @Disabled
    public void test2(){
        System.out.println("Test xaric edir");
    }

    @AfterEach
     void test3(){
        System.out.println("@AfterEach notasyonuna mailk bir method her test methodundan sonra bir defe calisir");
    }

    @AfterAll
    static void test4(){
        System.out.println("@AfterAll notasyonuna mailk bir method butun test methodlarindan sonra bir defe calisir");
    }
}
