package com.samsung;

import java.awt.List;
import java.util.*;

public class MyTv {
	boolean isPowerOn;
	private int channel;
	private int volume;
	
	ArrayList channels = new ArrayList();
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL = 1;
	
	//Getters and Setters
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel <= MAX_CHANNEL && channel >= MIN_CHANNEL){
			this.channel = channel;
			channels.add(String.valueOf(channel));
		}
		else{
			return;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume <= MAX_VOLUME && volume >= MIN_VOLUME){
			this.volume = volume;
		} else
			return;
	}
	
	//gotoPrevChannel method
	public void gotoPrevChannel() {
		ListIterator it = channels.listIterator();
		if(it.hasPrevious()){
			setChannel((int)it.previous());
		} else 
			return;
		System.out.println(it.previous());
	}
}