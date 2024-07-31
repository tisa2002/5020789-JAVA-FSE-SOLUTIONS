public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 250.0),
                new Order(2, "Bob", 150.0),
                new Order(3, "Charlie", 350.0),
                new Order(4, "Dave", 100.0)
        };

        System.out.println("Original Order:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        BubbleSort.sort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] ordersForQuickSort = {
                new Order(1, "Alice", 250.0),
                new Order(2, "Bob", 150.0),
                new Order(3, "Charlie", 350.0),
                new Order(4, "Dave", 100.0)
        };
        QuickSort.sort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
