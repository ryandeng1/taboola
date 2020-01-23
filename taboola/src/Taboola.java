/**
 * Created by ryandeng on 1/22/20.
 */
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.HashMap;
import java.util.Map;
public class Taboola {
    private Map<String, Integer> stringDigitMap;
    public Taboola() {
        this.stringDigitMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            this.stringDigitMap.put(Integer.toString(i), i);
        }
    }
    public int questionOne(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            throw new ValueException("Cannot parse string");
        }
        // Maps the string of each digit to the digit value.
        int result = 0;
        boolean negative = false;
        for (int i = 0; i < inputString.length(); i++) {
            String charAtIndex = Character.toString(inputString.charAt(i));
            if (i == 0 && charAtIndex.equals("-")) {
                negative = true;
            } else {
                if (this.stringDigitMap.containsKey(charAtIndex)) {
                    result = 10 * result + this.stringDigitMap.get(charAtIndex);
                } else {
                    throw new ValueException("Input string is not an integer");
                }
            }
        }
        if (negative) {
            result = -1 * result;
        }
        return result;
    }


    public boolean questionTwo(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return false;
        }
        for (int i = 0; i < inputString.length(); i++) {
            String charAtIndex = Character.toString(inputString.charAt(i));
            // If the string contains a single digit, return true.
            if (this.stringDigitMap.containsKey(charAtIndex)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
