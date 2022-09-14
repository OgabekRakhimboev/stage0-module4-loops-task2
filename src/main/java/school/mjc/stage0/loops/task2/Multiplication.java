package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
        printMultiplied(0);
    }

    public static void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }

        } else if (multiplyByAndToInclusive < 0) {
            while (counter >= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive * -1);
                counter--;
            }
        }

    }
}
