import java.util.Arrays;

class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

class ProductSearch {

    public Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    public Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == productId) {
                return products[mid];
            } else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Product not found
    }
}

class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Phone", "Electronics"),
                new Product(3, "Shirt", "Apparel"),
                new Product(4, "Shoes", "Apparel"),
                new Product(5, "Book", "Stationery")
        };

        ProductSearch search = new ProductSearch();

        // Linear Search
        Product foundProductLinear = search.linearSearch(products, 3);
        System.out.println("Linear Search Result: " + foundProductLinear);

        // Binary Search requires a sorted array by productId
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        Product foundProductBinary = search.binarySearch(products, 3);
        System.out.println("Binary Search Result: " + foundProductBinary);
    }
}
