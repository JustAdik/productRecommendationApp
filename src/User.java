import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int balance;
    private List<Product> purchases;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.purchases = new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if (product == null) {
            System.out.println("There is no product");
        }

        if (balance >= product.getPrice()) {
            purchases.add(product);
            balance -= product.getPrice();
            System.out.println(name + " bought " + product.getName() + " for " + product.getPrice());
        } else {
            System.out.println("Not enough funds to purchase a " + product.getName());
        }

    }

        public void showPurchases() {
            System.out.println();
            System.out.println("Purchases by user " + name + ":");
            if(purchases.isEmpty()) {
                System.out.println("You have no purchases");
            }else{
                for(Product product : purchases) {
                    System.out.println(product.getName());
                }
                System.out.println(balance);
            }
        }

}
