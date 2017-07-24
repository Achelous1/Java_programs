package com.nexon1;

public enum RockScissorsPaper {
	ROCK(1), SCISSORS(2), PAPER(3);
	
	int hand;
	RockScissorsPaper(int hand){
		this.hand = hand;
	}
}