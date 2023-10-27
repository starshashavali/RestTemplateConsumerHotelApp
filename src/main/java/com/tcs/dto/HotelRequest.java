package com.tcs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelRequest {
	@NotBlank(message = "Name cannot be blank")
	private String customerName;

	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of joinng should be in the format yyyy-MM-dd")
	private String doj;

	
	@NotNull(message = "roomNo number cannot be null")
	private String roomType;

}
