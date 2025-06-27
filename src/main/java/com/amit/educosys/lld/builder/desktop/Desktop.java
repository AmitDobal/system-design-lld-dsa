package com.amit.educosys.lld.builder.desktop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Desktop {
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    void display() {
        System.out.println("Desktop Configuration:");
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }
}
