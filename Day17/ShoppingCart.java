/*Shopping Cart
Create a class called Product with properties like productId, name, price, and quantityInStock. Use an ArrayList to store multiple product objects. Implement methods to:
• Add products to the shopping cart.
• Remove products from the shopping cart.
• Calculate the total cost of the products in the shopping cart.
• Display the products in the shopping cart.*/
import java.util.ArrayList;
class Product {
  private int productId;
  private String name;
  private double price;
  private int quantityInStock;

  public Product(int productId, String name, double price, int quantityInStock) {
    this.productId = productId;
    this.name = name;
    this.price = price;
    this.quantityInStock = quantityInStock;
  }

  public int getProductId() {
    return productId;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityInStock() {
    return quantityInStock;
  }
}

class ShoppingCart {
  private ArrayList<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
    System.out.println("Product added to the cart");
  }

  public void removeProduct(int productId) {
    for(int i = 0; i < products.size(); i++) {
      if(products.get(i).getProductId() == productId) {
        products.remove(i);
        System.out.println("Product removed from the cart");
        break;
      }
    }
  }

  public double calculateTotalCost() {
    double totalCost = 0;
    for(Product product : products) {
      totalCost += product.getPrice();
    }
    return totalCost;
  }

  public void displayProducts() {
    for(Product product : products) {
      System.out.println("Product in the cart: " + product.getName());
    }
  }

  public static void main(String args[]) {
    ShoppingCart cart = new ShoppingCart();
    Product p1 = new Product(1, "lapy", 100000, 3);
    Product p2 = new Product(2, "mob", 20000, 2);

    cart.addProduct(p1);
    cart.addProduct(p2);

    cart.displayProducts();
    cart.removeProduct(p2.getProductId());

    cart.displayProducts();
    System.out.println(cart.calculateTotalCost());
  }
}
