public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();

        // Value Type
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);

        // Reference Type
        int[] numbers1 = new int[]{1, 2, 3, 4};
        int[] numbers2 = new int[]{9, 8, 7, 6};
        numbers2 = numbers1;
        numbers1[0] = 5;
        System.out.println(numbers2[0]);

    }
}

