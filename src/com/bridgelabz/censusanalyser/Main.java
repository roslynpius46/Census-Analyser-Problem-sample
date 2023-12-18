package com.bridgelabz.censusanalyser;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Census Analyser Implementation");

        try {
            StateCensusAnalyser<CSVStateCensus> analyser = new StateCensusAnalyser<>();
            List<CSVStateCensus> censusDataList = analyser.loadCensusData("D:\\GE_BridgeLabz\\Census_Analyser_Problem\\src\\com\\bridgelabz\\censusanalyser\\sample-census-data.csv", CSVStateCensus.class);

            analyser.verifyRecordCount(5);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
