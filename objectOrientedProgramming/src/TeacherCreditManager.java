public class TeacherCreditManager extends BaseCreditManager implements CreditManagerInterface {
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }

    @Override
    public void save() {
        super.save();
    }
}