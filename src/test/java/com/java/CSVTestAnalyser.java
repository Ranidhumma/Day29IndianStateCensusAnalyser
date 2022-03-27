package com.java;

import org.junit.Test;

import com.Java.StateCensusAnalyser;

public class CSVTestAnalyser {

	@Test
	public void testCensusAnalyser() {

		StateCensusAnalyser sc = new StateCensusAnalyser();
		sc.loadData();
	}
}
