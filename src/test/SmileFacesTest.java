package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import codeWars.SmileFaces;

import java.util.*;

public class SmileFacesTest {

	@Test
	public void test1() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":D");
		a.add(":-}");
		a.add(":-()");
		assertEquals(2, SmileFaces.countSmileys(a));
	}

	@Test
	public void test1_1() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":D");
		a.add(":-}");
		a.add(":-()");
		assertEquals(2, SmileFaces.countSmileysOtherSolution(a));
	}

	@Test
	public void test1_2() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":D");
		a.add(":-}");
		a.add(":-()");
		assertEquals(2, SmileFaces.countSmileysOtherSolution1(a));
	}

	@Test
	public void test2() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add("XD");
		a.add(":0}");
		a.add("x:-");
		a.add("):-");
		a.add("D:");
		assertEquals(1, SmileFaces.countSmileys(a));
	}

	@Test
	public void test2_1() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add("XD");
		a.add(":0}");
		a.add("x:-");
		a.add("):-");
		a.add("D:");
		assertEquals(1, SmileFaces.countSmileysOtherSolution(a));
	}

	@Test
	public void test2_2() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add("XD");
		a.add(":0}");
		a.add("x:-");
		a.add("):-");
		a.add("D:");
		assertEquals(1, SmileFaces.countSmileysOtherSolution1(a));
	}

	@Test
	public void test3() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":D");
		a.add("X-}");
		a.add("xo)");
		a.add(":X");
		a.add(":-3");
		a.add(":3");
		assertEquals(2, SmileFaces.countSmileys(a));
	}

	@Test
	public void test3_1() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":D");
		a.add("X-}");
		a.add("xo)");
		a.add(":X");
		a.add(":-3");
		a.add(":3");
		assertEquals(2, SmileFaces.countSmileysOtherSolution(a));
	}

	@Test
	public void test3_2() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":D");
		a.add("X-}");
		a.add("xo)");
		a.add(":X");
		a.add(":-3");
		a.add(":3");
		assertEquals(2, SmileFaces.countSmileysOtherSolution1(a));
	}

	@Test
	public void test4() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":)");
		a.add("x-]");
		a.add(":ox");
		a.add(";-(");
		a.add(";-)");
		a.add(";~(");
		a.add(":~D");
		assertEquals(4, SmileFaces.countSmileys(a));
	}

	@Test
	public void test4_1() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":)");
		a.add("x-]");
		a.add(":ox");
		a.add(";-(");
		a.add(";-)");
		a.add(";~(");
		a.add(":~D");
		assertEquals(4, SmileFaces.countSmileysOtherSolution(a));
	}

	@Test
	public void test4_2() {
		List<String> a = new ArrayList<String>();
		a.add(":)");
		a.add(":)");
		a.add("x-]");
		a.add(":ox");
		a.add(";-(");
		a.add(";-)");
		a.add(";~(");
		a.add(":~D");
		assertEquals(4, SmileFaces.countSmileysOtherSolution1(a));
	}
}