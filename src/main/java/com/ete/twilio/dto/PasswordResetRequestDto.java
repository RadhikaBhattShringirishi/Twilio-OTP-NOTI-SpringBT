package com.ete.twilio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordResetRequestDto {
	
	private String phoneNumber; //will be our destination
	private String userName;
	private String oneTimePassword;

}
