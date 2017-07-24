package com.nexon1;

import java.util.Scanner;

public class Person extends Player{

	public void whatHand() {
		// TODO Auto-generated method stub
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a number from 1 - 3");
		System.out.println("1.Rock 2.Scissors 3.Paper 4.Close: ");
		while(true) {
			temp = scan.nextInt();
			if(temp > 0 && temp <= 3) {
				if(temp == 1) {
					hand = RockScissorsPaper.ROCK;
				} else if(temp == 2) {
					hand = RockScissorsPaper.SCISSORS;
				} else if(temp == 3) {
					hand = RockScissorsPaper.PAPER;
				} else if(temp == 4) {
					System.exit(0);;
				}
				break;
			} else {
				System.out.println("Not a valid number. try again");
			}
		}
	}

	@Override
	public boolean die() {
		// TODO Auto-generated method stub
		System.out.println("You have died");
		return true;
	}
	
	public String toString() {
		return "You";
	}
}
