package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(100);
    }

    public static void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            int check = 1;
            int count = 0;
            while (check <= counter) {
                if (counter % check == 0) {
                    count++;
                }
                check++;
            }
            if (count == 2) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
