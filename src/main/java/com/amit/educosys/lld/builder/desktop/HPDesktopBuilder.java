package com.amit.educosys.lld.builder.desktop;

public class HPDesktopBuilder extends DesktopBuilder {

    public HPDesktopBuilder() {
        desktop = new Desktop();
    }

    @Override
    protected DesktopBuilder buildMotherboard() {
        desktop.setMotherboard("HP Motherboard");
        return this;
    }

    @Override
    protected DesktopBuilder buildProcessor() {
        desktop.setProcessor("HP Processor");
        return this;
    }

    @Override
    protected DesktopBuilder buildMemory() {
        desktop.setMemory("HP Memory");
        return this;
    }

    @Override
    protected DesktopBuilder buildStorage() {
        desktop.setStorage("HP Storage");
        return this;
    }

    @Override
    protected DesktopBuilder buildGraphicsCard() {
        desktop.setGraphicsCard("HP Graphics Card");
        return this;
    }
}
