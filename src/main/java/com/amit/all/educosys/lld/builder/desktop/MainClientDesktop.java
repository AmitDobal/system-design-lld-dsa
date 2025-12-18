package com.amit.all.educosys.lld.builder.desktop;

public class MainClientDesktop {
    public static void main(String[] args) {
        DesktopDirector desktopDirector = new DesktopDirector();

        DesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop desktop = desktopDirector.buildDesktop(dellDesktopBuilder);
        desktop.display();
    }
}
