package com.hotelsaplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddReservation {
    private List<RoomsReservationDto> RooomToRes;
    private PersonReservationDto person;

    public AddReservation() {
    }

    public AddReservation(List<RoomsReservationDto> rooomToRes, PersonReservationDto person) {
        RooomToRes = rooomToRes;
        this.person = person;
    }

    public List<RoomsReservationDto> getRooomToRes() {
        return RooomToRes;
    }

    public void setRooomToRes(List<RoomsReservationDto> rooomToRes) {
        RooomToRes = rooomToRes;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
