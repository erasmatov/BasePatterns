package net.erasmatov.creational.abstractfactory.website;

import net.erasmatov.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code...");
    }
}
