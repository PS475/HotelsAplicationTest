package com.hotelsaplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelsListDto {
    private List<HotelsDto> hotels;

    public HotelsListDto() {
    }

    public HotelsListDto(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelsDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }
}
