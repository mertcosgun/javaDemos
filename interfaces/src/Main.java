public class Main {
    public static void main(String[] args) {
        CustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
    }
}