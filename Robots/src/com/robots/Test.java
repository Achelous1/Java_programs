package com.robots;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for(int i=0; i<arr.length; i++){
			action(arr[i]);
		}
	}
	
	public static void action(Robot r){
		if(r instanceof DanceRobot){
			DanceRobot d = (DanceRobot)r;
			d.dance();
		} else if(r instanceof SingRobot) {
			SingRobot s = (SingRobot)r;
			s.sing();
		} else if(r instanceof DrawRobot){
			((DrawRobot)r).draw();
		}
	}

}