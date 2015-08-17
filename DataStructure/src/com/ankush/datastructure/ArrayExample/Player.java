/**
 * 
 */
package com.ankush.datastructure.ArrayExample;

/**
 * @author axsoni3
 *
 */
public class Player {
	
	private String playerName;
	
	private Integer age;
	
	private Integer tshirtNumber;
	
	private String tshirtColor;
	
	public Player(String playerName, Integer age, Integer tshirtNumber, String tshirtColor){
		this.playerName = playerName;
		this.age = age;
		this.tshirtColor = tshirtColor;
		this.tshirtNumber = tshirtNumber;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getTshirtNumber() {
		return tshirtNumber;
	}

	public void setTshirtNumber(Integer tshirtNumber) {
		this.tshirtNumber = tshirtNumber;
	}

	public String getTshirtColor() {
		return tshirtColor;
	}

	public void setTshirtColor(String tshirtColor) {
		this.tshirtColor = tshirtColor;
	}

}
