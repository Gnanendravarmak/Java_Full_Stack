package com.grayMatter;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Users {
	
	
	
	private int uid;
	private String userName;
	private String fullName;
	private String password;

}
