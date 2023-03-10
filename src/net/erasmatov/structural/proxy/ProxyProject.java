package net.erasmatov.structural.proxy;

public class ProxyProject implements Project {
    String url;
    RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
