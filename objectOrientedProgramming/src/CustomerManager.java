public class CustomerManager {
    Customer _customer;
    CreditManagerInterface _creditManager;

    public CustomerManager(Customer customer, CreditManagerInterface creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    public void save() {
        System.out.println("Kullanıcı kaydedildi.");
    }

    public void delete() {
        System.out.println("Kullanıcı silindi.");
    }

    public void giveCredit() {
        _creditManager.calculate();
        _creditManager.save();
    }
}