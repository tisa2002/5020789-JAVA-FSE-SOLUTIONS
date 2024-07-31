public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(105.50);

        stockMarket.removeObserver(mobileApp);
        stockMarket.setStockPrice(110.00);
    }
}
