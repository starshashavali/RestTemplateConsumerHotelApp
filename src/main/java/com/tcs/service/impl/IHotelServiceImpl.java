package com.tcs.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.dto.HotelRequest;
import com.tcs.dto.HotelResponse;
import com.tcs.service.IHotelService;

@Service
public class IHotelServiceImpl implements IHotelService {

	private final String BOOK_HOTEL = "http://3.108.41.113:8086/save";

	private final String GET_ROOM = "http://3.108.41.113:8086/hotel/{id}";

	private final String DELETE_ROOM = "http://3.108.41.113:8086/Hotel/{roomNo}";

	private final String GETALLROOMS = "http://3.108.41.113:8086/getAllRooms";

	@Override
	public HotelResponse bookHotel(HotelRequest request) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<HotelResponse> response = restTemplate.postForEntity(BOOK_HOTEL, request, HotelResponse.class);
		return response.getBody();
	}

	@Override
	public HotelResponse getHotelRoom(Integer roomNo) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<HotelResponse> response = restTemplate.getForEntity(GET_ROOM, HotelResponse.class, roomNo);
		return response.getBody();
	}

	@Override
	public List<HotelResponse> getAllRooms() {
	    RestTemplate rt = new RestTemplate();
	    ResponseEntity<HotelResponse[]> response = rt.getForEntity(GETALLROOMS, HotelResponse[].class);
	    HotelResponse[] hotelResponses = response.getBody();
	    if (hotelResponses != null) {
	        return Arrays.asList(hotelResponses);
	    } else {
	        return new ArrayList<>();
	    }
	}


}
