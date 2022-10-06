public class Main {
    public static void main(String[] args) {
        /*
         * Bir sayının tam bölenlerinin toplamlarının sayıya eşit oldğu sayılara mükemmel sayı denir.
         * */
        int number = 8128;
        int total = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                total += i;
            }
        }
        if(number == total) {
            System.out.println("This number is a Perfect number");
        } else {
            System.out.println("This number not a Perfect number");
        }
    }
}