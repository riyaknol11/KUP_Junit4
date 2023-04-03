package com.knoldus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringUtilsTest {
    StringUtils stringUtils;

    @Before
    public void setup(){
        stringUtils = new StringUtils();
    }

    // reverseStringTestMethod1 method to test the reverse method on given string
    @Test
    public void reverseStringTestMethod1(){

        //action
        String reversedString= stringUtils.reverse("riya");
        assertEquals("ayir",reversedString);

    }

    //reverseStringTestMethod2 method to test the reverse method when string is empty.
    @Test
    public void reverseStringTestMethod2(){

        String reversedString = stringUtils.reverse( "");
        assertEquals("Invalid input", reversedString);
    }

    // stringEmptyOrNot_TestMethod1 method to test when string is empty.
    @Test
    public void stringEmptyOrNot_TestMethod1(){

        boolean result=stringUtils.EmptyOrNot("");
        assertEquals(true,result);
    }

    //  stringEmptyOrNot_TestMethod2 method to test if string is empty or not with a non-empty string.
    @Test
    public void stringEmptyOrNot_TestMethod2(){

        boolean result=stringUtils.EmptyOrNot("riya");
        assertEquals(false,result);
    }


    // testing method to test if string is Palindrome or not
    @Test
    public void isPalindromeOrNot_testMethod1(){

        boolean result=stringUtils.isPalindrome("radar");
        assertEquals(true,result);
    }


    // testing method to test a non-palindrome string.
    @Test public void isPalindromeOrNot_testMethod2(){
        boolean result=stringUtils.isPalindrome("Hello");
        assertEquals(false,result);
    }


    // testing method to test if string is Palindrome or not with an empty string.
    @Test
    public void isPalindromeorNot_testMethod3(){
        boolean result=stringUtils.isPalindrome("");
        assertEquals(false,result);
    }
    @After
    public void tearDown(){
        System.out.println("Called After every test");
    }

}
