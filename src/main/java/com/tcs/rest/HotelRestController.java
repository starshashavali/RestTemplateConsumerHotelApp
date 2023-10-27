package com.tcs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dto.HotelRequest;
import com.tcs.dto.HotelResponse;
import com.tcs.service.IHotelService;

@RestController
public class HotelRestController {

	@Autowired
	private IHotelService ihotelService;

	@PostMapping("/save")
	public ResponseEntity<?> bookHotel(@RequestBody HotelRequest request) {
		HotelResponse bookHotel = ihotelService.bookHotel(request);
		return ResponseEntity.status(HttpStatus.OK).body(bookHotel);
	}

	@GetMapping("hotel/{id}")
	public ResponseEntity<?> getHotelRoom(@PathVariable Integer id) {
		HotelResponse hotelRoom = ihotelService.getHotelRoom(id);
		return ResponseEntity.status(HttpStatus.OK).body(hotelRoom);
	}

	@GetMapping("/getAllRooms")
	public ResponseEntity<?> getAllRooms() {
		List<HotelResponse> allRooms = ihotelService.getAllRooms();
		return ResponseEntity.status(HttpStatus.OK).body(allRooms);
	}

}
