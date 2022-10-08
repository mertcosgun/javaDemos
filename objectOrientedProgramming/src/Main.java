public class Main {
    public static void main(String[] args) {

        // Person person = new Person(1, "Adana", "Ali", "Veli", "35795124680");
        CustomerManager customerManager = new CustomerManager(new Person(), new TeacherCreditManager());
        customerManager.giveCredit();

    }
}


/*
    //  değer tipler değişkenler eşitlendiği zaman direk olarak değerini alır
    int number1 = 10;
    int number2 = 20;
    number1 = number2;
    number2 = 100;
    System.out.println(number1);

    //  referans tipler eşitlendiğinde eşitlenmiş olduğu referansı(adresi) turarlar
    int[] numbers1 = new int[]{1, 2, 3, 4};
    int[] numbers2 = new int[]{10, 20, 30, 40};
    numbers1 = numbers2;
    numbers2[0] = 1000;
    System.out.println(numbers1[0]);

    CreditManager creditManager = new CreditManager();
    creditManager.calculate();
    creditManager.save();

    Customer customer = new Customer(1, "İzmir");
    customer.setId(1);
    customer.setFirstName("Mert");
    customer.setLastName("Coşgun");
    customer.setNationalIdentity("12345678910");

    Person person = new Person(1, "İzmir", "Mert", "Coşgun", "12345678910");
    Company company = new Company(2, "Muğla", "Arçelik", "09876543217");

    CustomerManager customerManager = new CustomerManager(person);
    customerManager.save();
    customerManager.delete();

     CustomerManager customerManager2 = new CustomerManager(company);
     customerManager2.save();
     customerManager2.delete();
*/