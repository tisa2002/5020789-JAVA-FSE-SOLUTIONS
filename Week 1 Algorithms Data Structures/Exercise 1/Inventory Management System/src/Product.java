import java.util.*;
public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;
    private static List<Product> inventory=new ArrayList<>();
    Product(int productId, String productName, int quantity, double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String toString(){
        return "Product{"+"productId="+productId+", productName='"+productName+'\''+", quantity="+quantity+", price="+price+'}';
    }
    public static void addProduct(Product product){
        inventory.add(product);
        System.out.println("Product added: "+product);
    }
    public static void updateProduct(int productId, String productName, int quantity, double price){
        for(Product product : inventory){
            if(product.getProductId()==productId){
                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);
                System.out.println("Product updated: "+product);
                return;
            }
        }
        System.out.println("Product with ID "+productId+" not found.");
    }
    public static void deleteProduct(int productId) {
        inventory.removeIf(product -> product.getProductId() == productId);
        System.out.println("Product with ID " + productId + " deleted.");
    }
    public static void displayProducts(){
        if(inventory.isEmpty()){
            System.out.println("No products in the inventory");
        }
        else{
            for(Product product : inventory){
                System.out.println(product);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    Product newProduct = new Product(id, name, quantity, price);
                    addProduct(newProduct);
                    break;
                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Product Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new Quantity: ");
                    int newQuantity = sc.nextInt();
                    System.out.print("Enter new Price: ");
                    double newPrice = sc.nextDouble();
                    updateProduct(updateId, newName, newQuantity, newPrice);
                    break;
                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = sc.nextInt();
                    deleteProduct(deleteId);
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
