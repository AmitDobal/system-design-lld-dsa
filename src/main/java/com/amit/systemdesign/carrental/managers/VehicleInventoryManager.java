package com.amit.systemdesign.carrental.managers;


import com.amit.systemdesign.carrental.entity.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class VehicleInventoryManager {
    private List<Vehicle> vehicles;

    public VehicleInventoryManager(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public VehicleInventoryManager() {
        this(new ArrayList<>());
    }

    //CRUD Operations

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void deleteVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void updateVehicle(String vehicleId, Vehicle vehicle) {
        var existingVehicle = this.vehicles.stream().filter(u -> vehicleId.equals(vehicle.getVehicleId()))
                .findFirst().orElse(null);
        mapVehicleToExistingVehicle(vehicle, existingVehicle);
    }

    private static void mapVehicleToExistingVehicle(Vehicle vehicle, Vehicle existingVehicle) {
        if (Objects.nonNull(vehicle) && Objects.nonNull(existingVehicle)) {
            existingVehicle.setVehicleNo(vehicle.getVehicleNo());
            existingVehicle.setType(vehicle.getType());
            existingVehicle.setStatus(vehicle.getStatus());
        }
    }
}
