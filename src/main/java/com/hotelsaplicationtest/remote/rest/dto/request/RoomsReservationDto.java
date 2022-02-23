package com.hotelsaplicationtest.remote.rest.dto.request;

public class RoomsReservationDto {
    private Integer id;
    private Integer roomID;
    private Integer days;

    public RoomsReservationDto() {
    }

    public RoomsReservationDto(Integer id, Integer roomID, Integer days) {
        this.id = id;
        this.roomID = roomID;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}

