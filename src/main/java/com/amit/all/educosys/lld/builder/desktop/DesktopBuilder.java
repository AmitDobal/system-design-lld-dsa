package com.amit.all.educosys.lld.builder.desktop;

public abstract class DesktopBuilder {

    Desktop desktop;

    protected abstract DesktopBuilder buildMotherboard();

    protected abstract DesktopBuilder buildProcessor();

    protected abstract DesktopBuilder buildMemory();

    protected abstract DesktopBuilder buildStorage();

    protected abstract DesktopBuilder buildGraphicsCard();

    Desktop build() {
        return desktop;
    }
}
