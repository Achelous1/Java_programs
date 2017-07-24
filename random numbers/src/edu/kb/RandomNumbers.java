package edu.kb;

import java.util.ArrayList;

public class RandomNumbers {
	public static void main(String args[]) {
		
		while(true) {
			ArrayList<Integer> numArr = new ArrayList<Integer>();					//saves random numbers
			
			for(int i = 0; i < 3; i++) {
				numArr.add((int)(Math.random() * 3 + 1));							//return integer from 1 to 3
				System.out.print(numArr.get(i) + "\t");
			}
			
			if(numArr.get(0).equals(numArr.get(1)) && numArr.get(0).equals(numArr.get(2))) {	//compares the 3 numbers
				System.out.print("success");
				break;
			} else
				System.out.println();
		}
	}
}