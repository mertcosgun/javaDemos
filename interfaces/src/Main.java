public class Main {
    public static void main(String[] args) {
        CustomerDal[] customerDals = new CustomerDal[]{new OracleCustomerDal(), new MySqlCustomerDal()};


        CustomerManager manager = new CustomerManager(customerDals);
        manager.add();
    }
}