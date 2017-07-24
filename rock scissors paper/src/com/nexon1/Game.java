package com.nexon1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game implements IGame{
	
	static ArrayList<Player> winners = new ArrayList<Player>();
	static ArrayList<Player> losers = new ArrayList<Player>();
	@Override
	public ArrayList<Player> getPlayers() {
		// TODO Auto-generated method stub
		ArrayList<Player> playerArr = new ArrayList<Player>();
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many computers : ");
		num = scan.nextInt();
		playerArr.add(new Person());
		playerArr.get(0).whatHand();
		for(int i = 1; i <= num; i ++) {
			playerArr.add(new Computer());
			playerArr.get(i).whatHand();
		}
		return playerArr;
	}
	
	public ArrayList<Player> getAgain(ArrayList<Player> players) {
		for(int i = 0; i < players.size(); i ++) {
			((List<Player>) players).get(i).whatHand();
		}
		return players;
	}

	@Override
	public void getWinner(ArrayList<Player> players) {
		// TODO Auto-generated method stub
		ArrayList<Player> rockList = new ArrayList<Player>();
		ArrayList<Player> scissorsList = new ArrayList<Player>();
		ArrayList<Player> paperList = new ArrayList<Player>();
		if(players.size() !=1) {
			winners.clear();
			for(int i = 0; i < players.size(); i++) {
				System.out.println(players.get(i).toString() + " \t" + players.get(i).hand);
				
				if(players.get(i).hand.hand == 1) {
					rockList.add(players.get(i));
				} else if(players.get(i).hand.hand == 2) {
					scissorsList.add(players.get(i));
				} else if(players.get(i).hand.hand == 3) {
					paperList.add(players.get(i));
				} 
			}
			
			if(rockList.isEmpty() && !scissorsList.isEmpty() && !paperList.isEmpty()) {
				winners = scissorsList;
				losers.addAll(paperList);
			} else if(scissorsList.isEmpty() && !rockList.isEmpty() && !paperList.isEmpty()) {
				winners = paperList;
				losers.addAll(rockList);
			} else if(paperList.isEmpty() && !rockList.isEmpty() && !scissorsList.isEmpty()) {
				winners = rockList;
				losers.addAll(scissorsList);
			} else {
				System.out.println("Its a draw");
				winners.addAll(getAgain(players));
			}
			System.out.println("Rock : " + rockList);
			System.out.println("Scissors : " + scissorsList);
			System.out.println("Paper : " + paperList);
			System.out.println("Winners : " + winners);
			System.out.println("Losers : " + losers);
			getWinner(winners);
		} else
			printWinners(winners, losers);
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		getWinner(getPlayers());
	}
	
	private void killPlayers(ArrayList<Player> losers) {
		for(int i = 0; i < losers.size(); i++) {
			losers.get(i).die();
		}
	}
	
	void printWinners(ArrayList<Player> losers, ArrayList<Player> winner) {
		for(int i = (losers.size() + 1); i > 1; i--) {
			System.out.println(i + "th place : " + losers.get(i-2));
		}
		System.out.println("The winner is : " + winner.get(0));
	}
}
