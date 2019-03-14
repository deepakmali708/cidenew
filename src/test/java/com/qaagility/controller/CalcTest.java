package com.qaagility.controller;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class CalcTest {

	@Test
public void testSlow() {
        System.out.println("slow");
      }

      @Test
	public void testSlower() {
        System.out.println("slower");
      }

      @Test
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
	
	
    }
