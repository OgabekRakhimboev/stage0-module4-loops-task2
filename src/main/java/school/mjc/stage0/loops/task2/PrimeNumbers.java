package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(21);
    }
    public static void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while (counter<=printToInclusive){
            int check = 1;
            while (check <= counter){
                if (counter%check == 0 && check == counter){
                    if (counter%2!=0 || counter == 2){
                        System.out.println(counter);
                    }
                    System.out.println("1st if");
                }
                check++;
            }
            counter++;
        }
    }
}
