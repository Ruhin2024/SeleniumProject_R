package day04_junit_webelements;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Practice03_R {

    @Test
    public void practice1(){
       String expectedData = "Object";
       String actualData = "Junit";
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    public void practice2(){
        String expectedData = "Java";
        String actualData = "Java";
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    public void practice3(){
        Assertions.assertTrue("java".contains("a"));
    }

    @Test
    public void practice4(){
        Assertions.assertTrue("oopie".contains("arraylist"));
    }

    @Test
    public void practice5(){
        Assertions.assertFalse("toappercase".contains("ariable"));
    }

    @Test
    public void practice6(){
        Assertions.assertFalse("tolipp".contains("tolipp"));
    }

    @Test
    public void practice7(){
        String expectedData = "Java4";
        String actualData = "Java5";
        Assertions.assertNotEquals(expectedData,actualData);
    }

    @Test
    public void practice8(){
        char[] expectedData = {'J','u','n','i','t','5'};
        char[] actualData ={'J','u','n','i','t','5'};
        Assertions.assertArrayEquals(expectedData,actualData);
    }

    @Test
    public void practice9(){
        String str = null;
        Assertions.assertNull(str);
    }

    @Test
    public void practice10(){
        String str ="Junit 5";
        Assertions.assertNotNull(str);
    }



}
