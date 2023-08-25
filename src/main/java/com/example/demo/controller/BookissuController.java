package com.example.demo.controller;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bookissue;
import com.example.demo.service.Bookissueservice;

@RestController
public class BookissuController {
	
	@Autowired 
	
	private Bookissueservice  bookissueservrice;
	
	
	@PostMapping("/save")
	public ResponseEntity save(@RequestBody Bookissue bookissueid ){
		
		bookissueservrice.savedata(bookissueid);
		
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity getdata() {
		bookissueservrice.getalldata();
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{bookissueid}")
	public ResponseEntity deleteData(@PathVariable int bookissueid ) {
		bookissueservrice.deleteBookissue(bookissueid);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("/getbookid/{bookid}")
	
	public ResponseEntity getbybookId(@PathVariable int bookid) {
		bookissueservrice.getsingledatabookid(bookid);
		return ResponseEntity.ok(HttpStatus.NOT_FOUND);
		
	}

}
