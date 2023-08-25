package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Getter
public class Member {

	
	@Id
	
	private int memberid;
	private String name;
	private LocalDateTime membershipDate;
	private String username;
	private String password;
	
}
