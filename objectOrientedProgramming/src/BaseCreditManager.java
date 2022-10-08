public abstract class BaseCreditManager implements CreditManagerInterface {
    @Override
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi");
    }
}
