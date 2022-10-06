public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int numberSearched = 12;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == numberSearched) {
                isThere = true;
                break;
            }
        }
        String message = "";
        if (isThere) {
            message = "The number searched exists in the array : " + numberSearched;
            showMessage(message);
        } else {
            message = "The number searched does not exists in the array : " + numberSearched;
            showMessage(message);
        }
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }
}