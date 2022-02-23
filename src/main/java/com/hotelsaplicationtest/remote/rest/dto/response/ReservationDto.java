package com.hotelsaplicationtest.remote.rest.dto.response;

import com.hotelsaplicationtest.domain.model.ReservationStatusType;
import com.hotelsaplicationtest.remote.rest.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomsDto> roomsReservation;
    private PersonReservationDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomsDto> roomsReservation, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomsDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomsDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
