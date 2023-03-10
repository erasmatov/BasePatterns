package net.erasmatov.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint not active.");
        activeSprint = false;
    }
}
