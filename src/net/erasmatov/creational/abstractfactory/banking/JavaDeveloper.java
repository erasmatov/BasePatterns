package net.erasmatov.creational.abstractfactory.banking;

import net.erasmatov.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
