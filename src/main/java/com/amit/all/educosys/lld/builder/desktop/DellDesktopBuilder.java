package com.amit.all.educosys.lld.builder.desktop;

public class DellDesktopBuilder extends DesktopBuilder {

    public DellDesktopBuilder() {
        desktop = new Desktop();
    }

    @Override
    protected DesktopBuilder buildMotherboard() {
        desktop.setMotherboard("Dell Motherboard");
        return this;
    }

    @Override
    protected DesktopBuilder buildProcessor() {
        desktop.setProcessor("Dell Processor");
        return this;
    }

    @Override
    protected DesktopBuilder buildMemory() {
        desktop.setMemory("Dell Memory");
        return this;
    }

    @Override
    protected DesktopBuilder buildStorage() {
        desktop.setStorage("Dell Storage");
        return this;
    }

    @Override
    protected DesktopBuilder buildGraphicsCard() {
        desktop.setGraphicsCard("Dell Graphics Card");
        return this;
    }
}
