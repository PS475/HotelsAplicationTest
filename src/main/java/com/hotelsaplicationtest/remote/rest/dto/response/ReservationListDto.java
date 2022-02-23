package com.hotelsaplicationtest.remote.rest.dto.response;

import java.util.List;

public class ReservationListDto {
    private List<ReservationDto> reservations;

    public ReservationListDto() {
    }

    public ReservationListDto(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}
