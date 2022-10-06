public class Main {
    public static void main(String[] args) {
        char grade = 'X';

        switch (grade) {
            case 'A':
                System.out.println("Excellent: You passed");
                break;
            case 'B':
                System.out.println("Very good: You passed");
                break;
            case 'C':
                System.out.println("Good: You passed");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("You did not succeed");
                break;
            default:
                System.out.println("Invalid grade entry. Please enter a valid note.");

        }
    }
}