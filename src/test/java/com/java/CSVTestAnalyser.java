package com.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.Java.InvalidFile;
import com.Java.StateCensusAnalyser;

public class CSVTestAnalyser {
	StateCensusAnalyser sc;

	@Before
	public void initialization() {
		sc = new StateCensusAnalyser();
	}

	@Test
	public void testRecordMatch() throws InvalidFile {
		sc.loadData("src/main/resources/IndianCensus");

		assertEquals(true, sc.checkData());
	}

	@Test
	public void testFileCheckSad() throws InvalidFile {
		sc.loadData("src/main/resources/IndianCensus");
	}
}
