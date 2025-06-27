package com.amit.systemdesign.carrental.entity;

import com.amit.systemdesign.carrental.managers.VehicleInventoryManager;
import lombok.Data;

import java.util.List;

@Data
public class Store {
    private String storeId;
    private Location location;
    private VehicleInventoryManager vehicleInventoryManager;
    private List<Reservation> reservations;


}
