package pl.jp.letters;

public class CharCounter {
    public int count(final char a, String inputStr) {
        /*int counter = 0;
        for(int i = 0; i < inputStr.length(); i ++) {
            if(inputStr.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;*/
        return (int) inputStr
                .toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c.equals(a))
                .count();
    }
}
