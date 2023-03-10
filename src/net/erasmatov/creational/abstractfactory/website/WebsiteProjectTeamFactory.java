package net.erasmatov.creational.abstractfactory.website;

import net.erasmatov.creational.abstractfactory.Developer;
import net.erasmatov.creational.abstractfactory.ProjectManager;
import net.erasmatov.creational.abstractfactory.ProjectTeamFactory;
import net.erasmatov.creational.abstractfactory.Tester;

public class WebsiteProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
