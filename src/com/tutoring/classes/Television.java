package com.tutoring.classes;
/**
 * The purpose of this class is to model a television
 * @author alexJenkins
 * @course Java Full Stack Development 
 * @section Core-Java
 * @instructor Ms.Lewis
 * @date 12/03/22
 */
public class Television {
	
	//Instance fields 
	/**
	 * Represents the brand name
	 */
	private String MANUFACTURER;
	/**
	 * Represents the screen size of the television
	 */
	private int SCREEN_SIZE;
	/**
	 * Hold boolean value
	 * true if power is on 
	 * false if power is off
	 */
	private boolean powerOn;
	/**
	 * Holds the value of current station 
	 */
	private int channel;
	/**
	 * Holds integer value representing current volume of loudness (0 being no sound)
	 */
	private int volume;
	
	
	
	/**
	 * Television constructor will be initialized with the following values.
	 * @param MANUFACTURER set by user at construction
	 * @param SCREEN_SIZE set by user at construction 
	 * Instantiation values
	 * powerOn: false
	 * volume: 20 
	 * channel: 2 
	 */
	public Television(String MANUFACTURER, int SCREEN_SIZE) {
		
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		
		this.powerOn = false;
		this.volume = 20;
		this.channel = 2;
	}
	
	
	/**
	 * Toggles powerOn attribute from true to false and vice verse 
	 */
	public void power() {
		if(powerOn) {
			this.powerOn = false;
		}else {
			this.powerOn = true;
		}
		
	}
	
	/**
	 * Updates the volume attribute by 1 
	 */
	public void increaseVolume() {
		this.volume ++;
	}
	/**
	 * Updates the volume attribute by -1
	 */
	public void decreaseVolume() {
		this.volume --;
	}

	
	
	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}

	public int getScreenSize() {
		return SCREEN_SIZE;
	}

	
	public void setChannel(int channel) {
		this.channel = channel;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
