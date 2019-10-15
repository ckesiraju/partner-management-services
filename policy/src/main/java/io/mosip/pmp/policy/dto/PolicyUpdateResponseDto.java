package io.mosip.pmp.policy.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PolicyUpdateResponseDto {

	private String id;
	
	private String name;
	
	private String desc;
	
	private boolean is_Active;
	
	private String cr_by;	
	
	private LocalDateTime cr_dtimes;
	
	private String up_by;
	
	private LocalDateTime upd_dtimes;

}
