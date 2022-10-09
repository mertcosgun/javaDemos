public class CustomerManager {
    private CustomerDal[] customerDals;

    public CustomerManager(CustomerDal[] customerDals) {
        this.customerDals = customerDals;
    }

    public void add() {
        // business codes
        for (CustomerDal customerDal : customerDals) {
            customerDal.add();
        }
    }
}
