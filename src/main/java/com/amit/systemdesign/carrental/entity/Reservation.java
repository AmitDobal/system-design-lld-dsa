package com.amit.systemdesign.carrental.entity;

import com.amit.systemdesign.carrental.enums.ReservationStatus;
import lombok.Data;

@Data
public class Reservation {
    private String reservationId;
    private User user;
    private Vehicle vehicle;
    private ReservationStatus status;
}
