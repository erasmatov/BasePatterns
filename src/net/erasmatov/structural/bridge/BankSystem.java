package net.erasmatov.structural.bridge;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developprogram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
