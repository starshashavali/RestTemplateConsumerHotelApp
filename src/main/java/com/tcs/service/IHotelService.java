package com.tcs.service;

import java.util.List;

import com.tcs.dto.HotelRequest;
import com.tcs.dto.HotelResponse;

public interface IHotelService {
	
	public HotelResponse bookHotel(HotelRequest request);
	
	public HotelResponse getHotelRoom(Integer roomNo);
	
	public List<HotelResponse> getAllRooms();
	

}
