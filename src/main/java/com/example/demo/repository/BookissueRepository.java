package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bookissue;
@Repository
public interface BookissueRepository extends JpaRepository<Bookissue, Integer>{

	

	Bookissue findAllById(int bookid);

	

}
