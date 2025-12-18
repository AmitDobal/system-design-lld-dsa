package com.amit.all.systemdesign.carrental;

import com.amit.all.systemdesign.carrental.managers.StoreManager;
import com.amit.all.systemdesign.carrental.managers.UserManager;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class VehicleRentalSystem {
    private final UserManager userManager;
    private final StoreManager storeManager;

}
