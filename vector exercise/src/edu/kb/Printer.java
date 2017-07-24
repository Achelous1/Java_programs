package edu.kb;

import java.util.*;

public class Printer {
	
	public Vector<Double> getNums(){
		
		Vector<Double> nums = new Vector<Double>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter " + (i+1) + "th number :");
			nums.add(scan.nextDouble());		//scanner에서 쓰레드 제어권이 OS로 넘어감
		}
		
		System.out.println("Vector : " + nums);
		return nums;
	}
	
	public void printBiggest(Vector<Double> nums) {
		Collections.sort(nums);
		System.out.println("The biggerst number is : " + nums.get(nums.size()-1));
	}
	
}