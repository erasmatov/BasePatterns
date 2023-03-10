package net.erasmatov.creational.abstractfactory.banking;

import net.erasmatov.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages Banking project...");
    }
}
