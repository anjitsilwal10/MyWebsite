package com.example.demo.repository;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.example.demo.controllers.model.ClubModel;

//@TODO explain later
@Component
public class ClubRepository {
	
	private ClubModel[] clubs = {
			new ClubModel("Barcelona", "Spain", "LaLiga"),
			new ClubModel("Chelsea", "England", "Barclays Premier League"),
			new ClubModel("PSG", "France", "Ligue 1"),
			new ClubModel("Bayern Munich", "Germany", "Bundesliga")
	};
	
	public HashMap<String, Object[]> getClubData() {
		HashMap<String, Object[]> result = new HashMap<>();
		result.put("result", clubs);
		return result;
	}
}
