package com.amit.systemdesign.carrental.managers;


import com.amit.systemdesign.carrental.entity.Store;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class StoreManager {
    private List<Store> stores;

    public StoreManager(List<Store> users) {
        this.stores = users;
    }

    public StoreManager() {
        this(new ArrayList<>());
    }

    //CRUD Operations

    public void addStore(Store store) {
        this.stores.add(store);
    }

    public void deleteStore(Store store) {
        this.stores.remove(store);
    }

    public void updateStore(String storeId, Store store) {
        var existingUser = this.stores.stream().filter(u -> storeId.equals(store.getStoreId()))
                .findFirst().orElse(null);
        mapStoreToExistingStore(store, existingUser);
    }

    private static void mapStoreToExistingStore(Store store, Store existingStore) {
        if (Objects.nonNull(store) && Objects.nonNull(existingStore)) {
            existingStore.setLocation(store.getLocation());
            existingStore.setReservations(store.getReservations());
//            existingStore.setVehicles(store.getVehicles());
        }
    }
}
