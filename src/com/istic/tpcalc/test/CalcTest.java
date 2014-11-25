package com.istic.tpcalc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.istic.tpcalc.app.command.AddCommand;
import com.istic.tpcalc.app.command.DivCommand;
import com.istic.tpcalc.app.command.ICommand;
import com.istic.tpcalc.app.command.MulCommand;
import com.istic.tpcalc.app.command.SubCommand;

public class CalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calcTestAddPosVal() throws Exception {
		int a = 2;
		int b = 3;
		int result = 5;
		ICommand addCmd = new AddCommand(a, b);
		assertEquals(result, addCmd.execute());
	}
	@Test
	public void calcTestAddNegVal() throws Exception {
		int a = -2;
		int b = -3;
		int result = -5;
		ICommand addCmd = new AddCommand(a, b);
		assertEquals(result, addCmd.execute());
	}
	@Test
	public void calcTestAddZeroVal() throws Exception {
		int a = 2;
		int b = 0;
		int result = 2;
		ICommand addCmd = new AddCommand(a, b);
		assertEquals(result, addCmd.execute());
	}
	@Test
	public void calcTestSubPosVal() throws Exception {
		int a = 2;
		int b = 3;
		int result = -1;
		ICommand subCmd = new SubCommand(a, b);
		assertEquals(result, subCmd.execute());
	}
	@Test
	public void calcTestSubNegVal() throws Exception {
		int a = -2;
		int b = -3;
		int result = 1;
		ICommand subCmd = new SubCommand(a, b);
		assertEquals(result, subCmd.execute());
	}
	@Test
	public void calcTestSubZeroVal() throws Exception {
		int a = 2;
		int b = 0;
		int result = 2;
		ICommand subCmd = new SubCommand(a, b);
		assertEquals(result, subCmd.execute());
	}	
	@Test
	public void calcTestMulPosVal() throws Exception {
		int a = 2;
		int b = 3;
		int result = 6;
		ICommand mulCmd = new MulCommand(a, b);
		assertEquals(result, mulCmd.execute());
	}
	@Test
	public void calcTestMulNegVal() throws Exception {
		int a = -2;
		int b = -3;
		int result = 6;
		ICommand mulCmd = new MulCommand(a, b);
		assertEquals(result, mulCmd.execute());
	}
	@Test
	public void calcTestMulZeroVal() throws Exception {
		int a = 2;
		int b = 0;
		int result = 0;
		ICommand mulCmd = new MulCommand(a, b);
		assertEquals(result, mulCmd.execute());
	}	
	@Test
	public void calcTestDivPosVal() throws Exception {
		int a = 4;
		int b = 2;
		int result = 2;
		ICommand divCmd = new DivCommand(a, b);
		assertEquals(result, divCmd.execute());
	}
	@Test
	public void calcTestDivNegVal() throws Exception {
		int a = -4;
		int b = -2;
		int result = 2;
		ICommand divCmd = new DivCommand(a, b);
		assertEquals(result, divCmd.execute());
	}
	@Test
	public void calcTestDivZeroVal(){
		try {
			int a = 2;
			int b = 0;
			ICommand divCmd = new DivCommand(a, b);;
			divCmd.execute();
	        fail("DivZero failed");
	    } catch(Exception e) {
	        assertNotNull(e.getMessage());
	    }
		
	}
	

}
