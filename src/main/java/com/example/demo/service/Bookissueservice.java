package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bookissue;
import com.example.demo.entity.Member;
import com.example.demo.repository.BookissueRepository;

@Service
public class Bookissueservice {
	@Autowired
	private BookissueRepository bookissuerepo;

	public Bookissue savedata(Bookissue bookissueid) {

		return bookissuerepo.save(bookissueid);
	}

	public void deleteBookissue(int bookissueid) {

		bookissuerepo.deleteById(bookissueid);
	}

	public List<Bookissue> getalldata() {
		return bookissuerepo.findAll();
	}

	public Bookissue getsingledatabookid(int bookid) {
		return bookissuerepo.findAllById(bookid);

	}

	public Bookissue getmembers(int memberid) {

		return bookissuerepo.findAllById(memberid);
	}
	
	public Bookissue updatebookisues(int bookissueid, Bookissue b) {
		Optional<Bookissue> s = bookissuerepo.findById(bookissueid);
		if (s.isPresent()) {
			Bookissue bookissue = s.get();
			bookissue.setBookissueid(b.getBookissueid());
			bookissue.setBook(b.getBook());
			bookissue.setMember(b.getMember());
			bookissue.setOrder(b.getOrder());
			bookissue.setIssueDate(b.getIssueDate());
			return bookissuerepo.save(bookissue);

		}
		else {
			return null;
		
	}
}
}


