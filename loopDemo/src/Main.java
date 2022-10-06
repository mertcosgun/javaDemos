public class Main {
    public static void main(String[] args) {
        // for
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For loop finished");

        // While
        int counter = 1;
        while (counter < 10) {
            System.out.println(counter);
            counter += 3;
        }
        System.out.println("While loop finished");

        // Do-While
        int counter2 = 3;
        do {
            System.out.println(counter2);
            counter2 += 2;
        } while (counter2 < 10);
        System.out.println("Do-While loop finished");

    }
}