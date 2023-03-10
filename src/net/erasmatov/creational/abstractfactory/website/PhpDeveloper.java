package net.erasmatov.creational.abstractfactory.website;

import net.erasmatov.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}
