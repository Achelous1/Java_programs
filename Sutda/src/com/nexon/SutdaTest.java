package com.nexon;

public class SutdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card(3, false);
		Card c2 = new Card();
		
		Card c3 = new Card(3, true);
		Card c4 = new Card(3, true);
		
		System.out.println("c1 : " + c1.info());
		System.out.println("c2 : " + c2.info());
		System.out.println(c3.equals(c4));
		System.out.println(c3.equals(c1));
	}

}