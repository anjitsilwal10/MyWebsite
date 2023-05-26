package com.example.demo.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ClubRepository;

@RestController
@RequestMapping("/clubs")
public class ClubController {
	
	// Dependency Injection
	@Autowired
	private ClubRepository clubRepository;
	
	// @TODO explain later
	@GetMapping
	@CrossOrigin(origins = "http://127.0.0.1:5500/")
	public HashMap<String, Object[]> getClubDetails()
	{
		return clubRepository.getClubData();
	}

}
