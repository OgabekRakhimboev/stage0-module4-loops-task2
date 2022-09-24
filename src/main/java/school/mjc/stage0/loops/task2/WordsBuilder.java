package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }

    public static void buildPhrase(char... chars) {
        String word = "";
        int counter = 0;
        int length = chars.length;
        while (counter < length) {
            word = word + chars[counter];
            counter++;
        }
        System.out.printf(word);
    }
}
