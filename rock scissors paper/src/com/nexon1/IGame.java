package com.nexon1;

import java.util.ArrayList;

public interface IGame {
	ArrayList<Player> getPlayers();
	void getWinner(ArrayList<Player> players);
	void playGame();
}