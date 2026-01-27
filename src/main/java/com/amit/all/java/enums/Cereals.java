package com.amit.all.java.enums;

public enum Cereals {
    MUESLI(8),
    KELLOGG(6),
    FRUIT_LOOPS(3),
    COCOA_PUFF(7),
    REESES_PUFF(5);

    private final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness){
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

    public int getLevelOfDeliciousness(){
        return levelOfDeliciousness;
    }
}
