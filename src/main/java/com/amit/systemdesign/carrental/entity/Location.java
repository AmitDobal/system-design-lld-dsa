package com.amit.systemdesign.carrental.entity;

import lombok.Data;

@Data
public class Location {
    private String locationId;
    private String address;
    private String city;
    private String state;
    private String country;
    private int pin;
}
