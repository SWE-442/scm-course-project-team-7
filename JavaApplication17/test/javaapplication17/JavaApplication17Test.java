/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication17;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class JavaApplication17Test {
    
    public JavaApplication17Test() {
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
     * Test of main method, of class JavaApplication17.
     */
     public static double add(double num1, double num2) {
        // Student Number 1 , add your code here
         return  num1 + num2 ;
          }
    @Test
    public void testMain() {
        add(8,9);
  double exbected =17;
double actual = add(8,9);

}
   @Test
    public void testMain2() {
        add(8,9);
  double exbected =8;
double actual = add(-1,9);

}
    }
    

