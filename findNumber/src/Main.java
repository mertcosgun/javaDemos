public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int numberSearched = 12;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == numberSearched) {
                isThere = true;
            }
        }
        if (isThere) {
            System.out.println("The number searched exists in the array.");
        } else {
            System.out.println("The number searched does not exists in the array.");
        }
    }
}