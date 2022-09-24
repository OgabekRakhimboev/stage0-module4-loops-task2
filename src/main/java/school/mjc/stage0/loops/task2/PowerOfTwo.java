package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(1);
    }

    public static void printPower(int power) {
        int counter = 1;
        int result = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(result);
            while (counter <= power) {
                result = result * 2;
                System.out.println(result);
                counter++;
            }
        }
    }
}
