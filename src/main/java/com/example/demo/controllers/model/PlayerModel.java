package com.example.demo.controllers.model;

public class PlayerModel {
	public String PlayerName;
	public String PlayerCountry;
	public String PlayerJerseyNo;
	
	public PlayerModel(String PlayerName,String PlayerCountry, String PlayerJerseyNo) {
		
		this.PlayerName = PlayerName;
		this.PlayerCountry = PlayerCountry;
		this.PlayerJerseyNo = PlayerJerseyNo;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public String getPlayerCountry() {
		return PlayerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		PlayerCountry = playerCountry;
	}

	public String getPlayerJerseyNo() {
		return PlayerJerseyNo;
	}

	public void setPlayerJerseyNo(String playerJerseyNo) {
		PlayerJerseyNo = playerJerseyNo;
	}

	
	
	
}
