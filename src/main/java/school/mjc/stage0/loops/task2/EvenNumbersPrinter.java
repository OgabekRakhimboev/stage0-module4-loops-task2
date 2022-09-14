package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        printEvenNumbers(20);
    }

    public static void printEvenNumbers(int printTillInclusive) {
        int counter = 2;
        while (counter <= printTillInclusive) {
            System.out.println(counter);
            counter += 2;
        }
    }
}
