package com.nexon1;

public class Computer extends Player {
	static int player = 0;
	@Override
	public void whatHand() {
		// TODO Auto-generated method stub
		int temp = (int)(Math.random() * 3 + 1);
		if(temp == 1) {
			hand = RockScissorsPaper.ROCK;
		} else if(temp == 2) {
			hand = RockScissorsPaper.SCISSORS;
		} else if(temp == 3) {
			hand = RockScissorsPaper.PAPER;
		}
	}

	@Override
	public boolean die() {
		// TODO Auto-generated method stub
		System.out.println(toString() + " has died");
		return true;
	}
	
	public String toString() {
		
		return "Computer" + hashCode();
	}
	

}
