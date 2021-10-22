package pl.jp.letters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharCounterTest {
    @Test
    public void itCountsCharsInInputString() {
        String inputStr = "Ala ma kota a kot ma mysz";
        CharCounter charCounter = new CharCounter();
        int charsCount = charCounter.count('a',inputStr);
        assertEquals(6,charsCount);


    }
}
