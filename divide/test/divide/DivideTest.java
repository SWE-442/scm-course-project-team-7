/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divide;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seela
 */
public class DivideTest {
    
    public DivideTest() {
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

   
   public static double divide (double num1, double num2){
       return num1 / num2;}
    @Test
    public void testMain (){
        divide(10,2);
        double expected = 5;
    double actual = divide(10, 2);
        
   }
     @Test
    public void testMain1 (){
      divide(20,5);
        double expected = 4;
    double actual = divide(20, 5);
    
}
    
}
