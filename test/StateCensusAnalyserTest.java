import com.bridgelabz.censusanalyser.CSVStateCensus;
import com.bridgelabz.censusanalyser.StateCensusAnalyser;
import com.bridgelabz.censusanalyser.CensusAnalyserException;
import com.opencsv.exceptions.CsvException;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @desc Test cases for StateCensusAnalyser
 */
public class StateCensusAnalyserTest {

    /**
     * @desc Verfiying record count
     */
    @Test
    public void testVerifyRecordCount() {

        String filePath = "D:\\GE_BridgeLabz\\Census_Analyser_Problem\\src\\com\\bridgelabz\\censusanalyser\\sample-census-data.csv";
        int expectedCount = 5;

        try {
            StateCensusAnalyser<CSVStateCensus> analyser = new StateCensusAnalyser<>();
            List<CSVStateCensus> censusDataList = analyser.loadCensusData(filePath, CSVStateCensus.class);

            // Verify the number of records matches the expected count
            analyser.verifyRecordCount(expectedCount);

            assertEquals("Number of records does not match expected count.", expectedCount, censusDataList.size());
        } catch (IOException | CsvException | CensusAnalyserException e) {
            e.printStackTrace();
        }
    }

    /**
     * @desc To verify if the exception is raised when incorrect csv file is given
     */
    @Test
    public void testLoadCensusDataWithIncorrectFile() {

        String incorrectFilePath = "incorrect_file.csv";

        try {
            StateCensusAnalyser<CSVStateCensus> analyser = new StateCensusAnalyser<>();

            List<CSVStateCensus> censusDataList = analyser.loadCensusData(incorrectFilePath, CSVStateCensus.class);

            assertTrue("Expected CensusAnalyserException was not thrown.", false);
        } catch (IOException | CsvException | CensusAnalyserException e) {

        }
    }
}
