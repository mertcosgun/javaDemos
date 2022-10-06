public class Main {
    public static void main(String[] args) {
        String student1 = "Ali";
        String student2 = "Veli";
        String student3 = "Aslı";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("------------------------------");

        String[] students = new String[3];
        students[0] = "Ali";
        students[1] = "Veli";
        students[2] = "Aslı";
        for(int i =0 ; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("------------------------------");

        for (String student: students) {
            System.out.println(student);
        }
    }
}