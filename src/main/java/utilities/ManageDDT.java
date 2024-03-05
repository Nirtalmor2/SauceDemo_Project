package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps {

    @DataProvider(name = "data-provider-users")
    public Object[][] getDataObject() {
        return getDataFromCSV(getData("DDTFile"));
    }

    public static List<String> readCSV(String csvFile) {
        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;

    }

    public static Object[][] getDataFromCSV(String filePath) {
        List<String> csvData = readCSV(filePath);
        csvData.remove(csvData.size() - 1);
        Object[][] data = new Object[csvData.size()][];
        for (int i = 0; i < csvData.size(); i++) {
            data[i] = csvData.get(i).split(",");
        }
        return data;
    }


}
