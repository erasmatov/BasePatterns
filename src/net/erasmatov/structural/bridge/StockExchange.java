package net.erasmatov.structural.bridge;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developprogram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
