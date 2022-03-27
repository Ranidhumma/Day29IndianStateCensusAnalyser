package com.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.Java.StateCensusAnalyser;

public class CSVTestAnalyser {
	StateCensusAnalyser sc;

	@Before
	public void initialization() {
		sc = new StateCensusAnalyser();
	}

	@Test
	public void testRecordMatch() {
		sc.loadData();
		assertEquals(true, sc.checkData());

	}

}
