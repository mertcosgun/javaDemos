public class Main {
    public static void main(String[] args) {
        int number1 = 100, number2 = 99, number3 = 101;
        int biggest = number1;
        if(biggest < number2) {
            biggest = number2;
        }
        if(biggest < number3) {
            biggest = number3;
        }
        System.out.println("The biggest number : " + biggest);
    }
}