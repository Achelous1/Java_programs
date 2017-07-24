package com.samsung;

import java.util.HashSet;
import java.util.Iterator;

import numbers.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv samsungTv = new MyTv();
		
		samsungTv.setChannel(10);
		System.out.println("CH : " + samsungTv.getChannel());
		samsungTv.setVolume(20);
		System.out.println("Vol : " + samsungTv.getVolume());
		samsungTv.setChannel(20);
		System.out.println("CH : " + samsungTv.getChannel());
		samsungTv.gotoPrevChannel();
		System.out.println("CH : " + samsungTv.getChannel());
		//System.out.println(samsungTv.channels);
		
		/*HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(5));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("Number of Data saved : " + hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());*/
	}

}