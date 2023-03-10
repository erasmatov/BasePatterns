package net.erasmatov.creational.abstractfactory.banking;

import net.erasmatov.creational.abstractfactory.Developer;
import net.erasmatov.creational.abstractfactory.ProjectManager;
import net.erasmatov.creational.abstractfactory.ProjectTeamFactory;
import net.erasmatov.creational.abstractfactory.Tester;

public class BankingProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
