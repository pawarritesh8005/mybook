package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Bookissue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  bookissueid;
	
	@ManyToOne
	@JoinColumn(name="bookid")
	private Book book;
	
	@ManyToOne
	@JoinColumn(name="memberid")
	private Member member;
	
	private LocalDateTime issueDate;
	private LocalDateTime returnDate;
	private double returnfee;
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private Order order;

}
