package net.erasmatov.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/erasmatov/proxy");
        project.run();
    }
}
