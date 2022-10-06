public class Main {
    public static void main(String[] args) {
        // First Solution
        int number = 112;
        int counter = 0;

        if(number == 1) {
            System.out.println("Number not a prime number");
            return;
        }

        if (number >= 2) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0.0) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("Number not a prime number");
            } else {
                System.out.println("This number is a prime number");
            }
        } else {
            System.out.println("Please enter a number greater than 1");
        }


        // Second Solution
        boolean isPrime = true;

        if (number >= 2) {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }


            if (isPrime) {
                System.out.println("This number is a prime number");
            } else {
                System.out.println("Number not a prime number");
            }
        } else {
            System.out.println("Please enter a number greater than 1");
        }

    }
}