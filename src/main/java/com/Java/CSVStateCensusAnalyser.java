package com.Java;

public class CSVStateCensusAnalyser {
	String state;
	long population;
	int areaInSqKm;
	double densityPerSqKm;

	/**
	 * Created constructor
	 */
	public CSVStateCensusAnalyser(String state, long population, int areaInSqKm, double densityPerSqKm) {
		super();
		this.state = state;
		this.population = population;
		this.areaInSqKm = areaInSqKm;
		this.densityPerSqKm = densityPerSqKm;
	}

	/* Display output in to string method */

	@Override
	public String toString() {
		return "CSVStateCensus [state=" + state + ", population=" + population + ", areaInSqKm=" + areaInSqKm
				+ ", densityPerSqKm=" + densityPerSqKm + "]";
	}

}
