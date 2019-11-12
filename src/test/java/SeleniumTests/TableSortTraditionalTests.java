package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TableSortTraditionalTests extends TestBase {
    @Test
    /**
     * This test verifies that the sorting of amount column is correct. Furthermore, it also confirms that data integrity is maintained and
     * the description matches the amount after sorting
     */
    public void testTableSort() {

        driver.get(appURLV1);
        login.loginForm("test", "test");

        HashMap<String, String> beforeSort;
        HashMap<String, String> afterSort;
        ArrayList<Double> beforeAmt;
        ArrayList<Double> afterAmt;

        beforeSort = home.getTableElements();
        beforeAmt = home.getAmountColumn();
        home.clickSort();
        afterSort = home.getTableElements();
        afterAmt = home.getAmountColumn();

        Collections.sort(beforeAmt);
        Assert.assertEquals(beforeAmt, afterAmt, "Column not sorted correctly");

        Map sortedMap = beforeSort.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        Assert.assertEquals(sortedMap, afterSort, "Data integrity lost- Description value mismatch!");

    }
}
