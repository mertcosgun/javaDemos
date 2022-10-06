public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("All in one");// name = "Laptop";
        product.setId(1); // id = 1;
        product.setDescription("iMac"); // description = "Asus Laptop";
        product.setPrice(66000); // price = 66000;
        product.setStockAmount(3); // stockAmount = 3;
        product.setColor("Green"); // color = "blue";
        System.out.println(product.getName()); // (product.name);
        System.out.println(product.getCode());


        Product product1 = new Product(2, "Laptop", "Gaming Notebook", 97000, 5, "Black");
        System.out.println(product1.getName());
        System.out.println(product1.getCode());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product1);
    }
}