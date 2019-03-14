package com.qaagility.controller;

import com.qaagility.javaee.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class CalcTest {

	
public void testSlow() {
        System.out.println("slow");
      }

      
	public void testSlower() {
        System.out.println("slower");
      }

      
	public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	@Test	
      public void Test111() {
Calcmul pp=new Calcmul();
	          Calculator pp1=new Calculator();
int res1=pp1.add();
int res=pp.mul();
        assertEquals("Result - Fail", 18, res);

        assertEquals("Result - Fail", 9, res1);
      }
	
    }
