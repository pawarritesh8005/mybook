package com.example.demo.entity;

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
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	private String isbn;
	private String booktitle;
	
	@ManyToOne
	@JoinColumn(name="publisherid")
	private Publisher publisher;
	
	private String bookDurationName;
	private int borrwDuration;
	private double borrwPrice;
	
	

}
