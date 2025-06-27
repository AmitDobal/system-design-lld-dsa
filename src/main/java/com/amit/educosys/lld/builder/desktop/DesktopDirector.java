package com.amit.educosys.lld.builder.desktop;

public class DesktopDirector {

    private static volatile DesktopDirector instance;

    DesktopDirector() {

    }

    public static DesktopDirector getInstance(){
        if(instance == null){
            synchronized (DesktopDirector.class) {
                if(instance == null){
                    instance = new DesktopDirector();
                }
            }
        }
        return instance;
    }

    public Desktop buildDesktop(DesktopBuilder desktopBuilder) {
        desktopBuilder.buildMotherboard();
        desktopBuilder.buildProcessor();
        desktopBuilder.buildMemory();
        desktopBuilder.buildStorage();
        desktopBuilder.buildGraphicsCard();
        return desktopBuilder.build();
    }
}
