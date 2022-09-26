package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class ExamOneSec3Tests {

	@Test
	void findResultTest1() {
		String[][] input = {
				{"kdzmy", "myta", "etmy", "ytarg"},
				{"ym", "r", "ta", "yta", "xltm", "etc"},
				{"getap", "rg", "e", "tarz"}
		};
		
		String[] actual = ExamOneSec3.findResult(input, "mytarget");
		String[] expected = {"etmytarg", "mytargetap", "mytargetc", "rgetmyta",
				"targetmy", "xltmytarge", "ytargetmy"};
		
		assertArrayEquals(actual, expected);
	}
	
	@Test
	void findResultTest2() {
		String[][] input = {
				{"vi", "vifoo", "t", "i"},
				{"o", "olefoo", "le"},
				{"let", "vio", "tv"}
		};
		
		String[] actual = ExamOneSec3.findResult(input, "violet");
		String[] expected = {"letvio", "letvio", "letviolefoo", "olefooletvi",
				"olefooletvifoo", "oletvi", "oletvifoo", "tviole", "tviolefoo", "violet", 
				"violet"};
		
		assertArrayEquals(actual, expected);
	}
	
	@Test
	void findResultTest3() {
		String[][] input = {
				{"ye", "clumsy", "asymmetry", "yellow"},
				{"asterisk", "eagle", "scale", "has"}
		};
		
		String[] actual = ExamOneSec3.findResult(input, "easy");
		String[] expected = {"clumsyeagle", "eagleasymmetry", "hasye", "hasyellow",
				"scaleasymmetry", "yeasterisk"};
		
		assertArrayEquals(actual, expected);
	}
	
	@Test
	void findResultTest4() {
		String[][] input = {
				{"pretend", "ityse", "pit", "eren"},
				{"serena", "render", "y", "i", "has", "endorse"},
				{"tyson", "endi"},
				{"di", "closer", "dip"},
		};
		
		String[] actual = ExamOneSec3.findResult(input, "serendipity");
		String[] expected = {"closerendipity", "dipityserenderendi", "dipityserendertyson",
				"endidipityserender", "erendipityson", "tysondipityserender"};
		
		assertArrayEquals(actual, expected);
	}
	
}