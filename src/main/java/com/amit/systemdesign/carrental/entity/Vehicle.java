package com.amit.systemdesign.carrental.entity;

import com.amit.systemdesign.carrental.enums.VehicleStatus;
import com.amit.systemdesign.carrental.enums.VehicleType;
import lombok.Data;

@Data
public class Vehicle {
    private String vehicleId;
    private String vehicleNo;
    private VehicleType type;
    private VehicleStatus status;

}
