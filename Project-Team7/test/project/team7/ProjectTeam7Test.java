/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.team7;

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
public class ProjectTeam7Test {
    
    public ProjectTeam7Test() {
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
     * Test of main method, of class ProjectTeam7.
     */
   
   public static double Subtract (double num1, double num2){
       return num1 - num2;}
    @Test
    public void testMain (){
        Subtract(10,5);
        double expected = 5;
    double actual = Subtract(10, 5);
        
   }
     @Test
    public void testMain1 (){
        Subtract(200,100);
        double expected = 100;
    double actual = Subtract(200, 100);
        
   }
    
   
}
