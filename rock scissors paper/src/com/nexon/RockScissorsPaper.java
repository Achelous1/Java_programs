package com.nexon;

import java.util.Scanner;

public class RockScissorsPaper implements IGame {
	private int person;
	private int computer;
	
	@Override
	public void getRockScissorsPaper() {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a number from 1 - 3");
		System.out.println("1.Rock 2.Scissors 3.Paper : ");
		while(true) {
			temp = scan.nextInt();
			if(temp > 0 && temp <= 3) {
				person = temp;
				break;
			} else {
				System.out.println("Not a valid number. try again");
			}
		}
	}

	@Override
	public void playGame() {
		getRockScissorsPaper();
		computer = (int)(Math.random() * 3 + 1);		//Initialize computer number from 1 - 3
		if(person == computer) {
			System.out.println("It's a draw");
		} else if ((person == 1 && computer == 2) || (person == 2 && computer == 3) || (person == 3 && computer == 1)) {
			System.out.println("You are the winner");
		} else if ((computer == 1 && person == 2) || (computer == 2 && person == 3) || (computer == 3 && person == 1)) {
			System.out.println("Computer is the winner");
		} else
			System.out.println("There has been an error. Closing program");
	}
}
