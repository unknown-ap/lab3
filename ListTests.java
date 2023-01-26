import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    @Test
    public void testFilterS() {
        List<String> list = new ArrayList<>();
        list.add("word");
        list.add("words");
        list.add("wordsa");
        list.add("wordo");

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
                return s.contains("a");
            }
        };
        
        
        List<String> list2 = ListExamples.filter(list, sc);
        assertArrayEquals(new String[]{"word", "words", "wordo"}, list2.toArray());
    }


}
