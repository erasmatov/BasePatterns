package net.erasmatov.creational.abstractfactory;

import net.erasmatov.creational.abstractfactory.website.WebsiteProjectTeamFactory;

public class AuctionWebsite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website project...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
