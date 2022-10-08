public class MilitaryCreditManager extends BaseCreditManager implements CreditManagerInterface {
    @Override
    public void calculate() {
        System.out.println("Askeri kredisi hesaplandı.");
    }
}