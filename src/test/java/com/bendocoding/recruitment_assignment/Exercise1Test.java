/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bendocoding.recruitment_assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bendo
 */
public class Exercise1Test {
    
    public Exercise1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class Exercise1.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        int Number = 0;                             //tested value has to be initialized to zero for accurate results
        Exercise1 instance = new Exercise1();       //instantiation of class
        boolean expResult = true;                   //expect result is true as we checking if it's even number and don't really care if it's odd
        boolean result = instance.isEven(Number);   //calling method from class passing 1 integer parameter
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isPrime method, of class Exercise1.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int Number = 2;                                 //tested value has to be initialized to two for accurate results as 0 and 1 not PrimeNumbers
        Exercise1 instance = new Exercise1();          //instantiation of class
        boolean expResult = true;                       //expect result is true as we checking if it's prime Number.
        boolean result = instance.isPrime(Number);      //calling method from class passing 1 integer parameter
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isPalindrome method, of class Exercise1.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        int Number = 0;                                 //testing from value 0
        Exercise1 instance = new Exercise1();           //instantion of class
        boolean expResult = true;                       //We Checking if it's Palindrome only.
        boolean result = instance.isPalindrome(Number);//calling method from class passing 1 integer parameter
        assertEquals(expResult, result);        
       
    }
    
}
