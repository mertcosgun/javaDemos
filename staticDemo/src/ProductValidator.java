public class ProductValidator {
    static {
        System.out.println("Static constructor çalıştı.");
    }

    public ProductValidator() {
        System.out.println("Constructor çalıştı.");
    }

    public static boolean isValid(Product product) {
        if (product.getPrice() > 0 && !product.getName().isEmpty()) {
            return true;
        }
        return false;
    }

    public void bisey() {
        System.out.println("Bişey fonksiyonu çalıştı");
    }


    public static class AnotherClass {
        // inner class
        public static void delete() {
            System.out.println("Silindi");
        }
    }
}
