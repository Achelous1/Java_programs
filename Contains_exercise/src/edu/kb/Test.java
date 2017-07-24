package edu.kb;

public class Test {
	
	public static boolean contains(String src, String target){
		/*if(src.contains(target))
			return true;
		else
			return false;*/
		
		return src.indexOf(target) != -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}

}