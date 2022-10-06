public class ProductManager {
    public void Add(Product product) {
        System.out.println(product.getName() + " added."); // (product.name + " added");
    }

    public void Add2(int id, String name, String description, int stockAmount, double price) {
        // This is the worst way
    }
}
