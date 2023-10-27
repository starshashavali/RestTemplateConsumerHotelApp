package com.tcs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelResponse {
	
	private Integer roomNo;
	
	private String customerName;

	private String doj;


	private String roomType;
	
	
	private String bookStatus;
	
	private String price;

}
