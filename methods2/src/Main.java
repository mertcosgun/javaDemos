public class Main {
    public static void main(String[] args) {
        String city = getCity();
        System.out.println(city.substring(0, 3));
        int number = add(5, 8);
        System.out.println(number);

        int result = add2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(result);
    }

    public static void create() {
        System.out.println("Created");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add2(int... numbers) {
        int result = 0;
        for (int number : numbers
        ) {
            result += number;
        }
        return result;
    }


    public static String getCity() {
        return "Izmir";
    }
}