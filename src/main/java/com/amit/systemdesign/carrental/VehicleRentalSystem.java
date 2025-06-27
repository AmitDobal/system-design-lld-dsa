package com.amit.systemdesign.carrental;

import com.amit.systemdesign.carrental.entity.Store;
import com.amit.systemdesign.carrental.managers.StoreManager;
import com.amit.systemdesign.carrental.managers.UserManager;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class VehicleRentalSystem {
    private final UserManager userManager;
    private final StoreManager storeManager;

}
