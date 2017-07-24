package edu.kb;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Point3D<Integer> p1 = new Point3D<Integer>(1, 2, 3);
		Point3D<Integer> p2 = new Point3D<Integer>(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2 ? "+(p1==p2));
		System.out.println("p1.equals(p2) ? "+(p1.equals(p2)));
		
		
	}

}