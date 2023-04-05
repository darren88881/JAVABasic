package atguigu.com;


import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        Pattern pattern = Pattern.compile("([0-9a-z_!~*'()-]+\\.)*");

        ArrayList<String> strList2 = new ArrayList<>();
        strList2.add("example_*()");
        strList2.add("example_*().");
        strList2.add("exam234324ple_*().");
        strList2.add("example_sfs().");
        strList2.add("example_sfs().ewrwe");
        strList2.add("example_sfs().ewrwe()");

        for (String str : strList2) {
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
    }
}
