import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ryandeng on 1/22/20.
 */
public class TaboolaTest {
    @Test
    public void questionOne() {
        Taboola taboola = new Taboola();
        String s1 = "123";
        String s2 = "035";
        String s3 = "1029467";
        String negString = "-134";
        assertEquals(123, taboola.questionOne(s1));
        assertEquals(35, taboola.questionOne(s2));
        assertEquals(1029467, taboola.questionOne(s3));
        assertEquals(-134, taboola.questionOne(negString));
    }

    @org.junit.Test
    public void testNullQuestionOne() {
        Taboola taboola = new Taboola();
        String test = null;
        assertThrows(ValueException.class, () -> {
            taboola.questionOne(test);
        });

    }

    @org.junit.Test
    public void testInvalidQuestionOne() {
        Taboola taboola = new Taboola();
        String test = "ABC";
        assertThrows(ValueException.class, () -> {
            taboola.questionOne(test);
        });
    }


    @org.junit.Test
    public void testQuestionTwo() {
        Taboola taboola = new Taboola();
        String s1 = "45222";
        String s2 = "This is A Test4me";
        String s3 = "IAMGOOD";
        assertEquals(true, taboola.questionTwo(s1));
        assertEquals(true, taboola.questionTwo(s2));
        assertEquals(false, taboola.questionTwo(s3));
    }

}


