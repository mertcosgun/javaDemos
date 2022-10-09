public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.add(new Product(1, "", 10));

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}