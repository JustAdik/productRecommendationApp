public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Iphone13", 280000);
        Product p2 = new Product(2, "MacBook", 500000);
        Product p3 = new Product(3, "AirPods", 72000);

        User user = new User("Alihan", 400000);
        user.buyProduct(p1);
        user.buyProduct(p2);
        user.buyProduct(p3);
        user.showPurchases();
    }
}
