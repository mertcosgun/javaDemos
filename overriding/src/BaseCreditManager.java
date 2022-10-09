public class BaseCreditManager {
    // Eğer override edilmesini istemiyorsank final key word'ünü eklememiz yeterli olur
    // public final double calculate(double amount)
    public double calculate(double amount) {
        return amount * 1.18;
    }
}
