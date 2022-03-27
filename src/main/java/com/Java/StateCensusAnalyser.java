package com.Java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StateCensusAnalyser {
	ArrayList<CSVStateCensusAnalyser> censusData = new ArrayList<CSVStateCensusAnalyser>();

	/**
	 * Here we created method laodData loads CSV data. the CSVReader class is used
	 * to read a CSV file. The class provides CSVReader class constructor to parse a
	 * CSV file. We are using a while loop to read the file line by line. we are
	 * using a for loop to display the list
	 * 
	 * @param string
	 */

	public void loadData(String filePath) throws InvalidFile {
		try {

			CSVReader reader = new CSVReader(new FileReader("src/main/resources/IndianCensus1"));
			String[] record;
			record = reader.readNext();

			while ((record = reader.readNext()) != null) {
				censusData.add(new CSVStateCensusAnalyser(record[0], Long.parseLong(record[1]),
						Integer.parseInt(record[2]), Double.parseDouble(record[3])));
			}

			for (CSVStateCensusAnalyser data : censusData) {
				System.out.println(data);
			}
		} catch (

		FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * We are checking the size of the list to check if we have all the entries.
	 * 
	 * @return true if sized is 29 (state)
	 */

	public boolean checkData() {
		if (censusData.size() == 29)

			return true;

		return false;
	}

}
