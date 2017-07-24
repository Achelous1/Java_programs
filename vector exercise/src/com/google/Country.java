package com.google;


import java.util.*;

public class Country {
	String name;
	int population;
	
	public HashMap<String, Long> getCountry(){
		HashMap<String, Long> countryMap = new HashMap<String, Long>();
		for(int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter country, population : ");
			countryMap.put(scan.nextLine(), scan.nextLong());
		}
		return countryMap;
	}
	
	public void printBiggest(HashMap<String, Long> country) {
		Map.Entry<String, Long> maxEntry = null;
		for (Map.Entry<String, Long> entry : country.entrySet()) {
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
		        maxEntry = entry;
		    }
		}
		System.out.println("The country with most population is : " + maxEntry.getKey() + " " + maxEntry.getValue());
		/*{
			long max = 0;
			String nation = "";
			Set<String> names = country.keySet();
			Iterator<String> it = names.iterator();
			while(it.hasNext()) {
				String name = it.next();
				Long n = country.get(name);
				if(max < n) {
					max = n;
					nation = name;
				}
			}
			System.out.println("The country with most population is : " + nation + " " + max);
		}*/
	}
	
}
