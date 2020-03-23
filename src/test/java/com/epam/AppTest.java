package com.epam;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    
    @Test
    public void Test1(){
        App obj = new App();
        String tc1 = "ABCD";
        assertEquals("BCD",obj.solve(tc1));
    }
    @Test
    public void Test2(){
        App obj = new App();
        String tc2 = "AACD";
        assertEquals("CD",obj.solve(tc2));
    }
    @Test
    public void Test3(){
        App obj = new App();
        String tc3 = "BACD";
        assertEquals("BCD",obj.solve(tc3));
    }
    @Test
    public void Test4(){
        App obj = new App();
        String tc4 = "BBAA";
        assertEquals("BBAA",obj.solve(tc4));
    }
    @Test
    public void Test5(){
        App obj = new App();
        String tc5 = "AABAA";
        assertEquals("BAA",obj.solve(tc5));
    }
    @Test
    public void Test6(){
        App obj = new App();
        String tc6 = "Aa";
        assertEquals("",obj.solve(tc6));
    }
    @Test
    public void Test7(){
        App obj = new App();
        String tc7 = "aAaAAAA";
        assertEquals("aAAAA",obj.solve(tc7));
    }
}
