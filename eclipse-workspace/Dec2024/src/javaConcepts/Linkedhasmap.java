package javaConcepts;

import java.util.LinkedHashMap;

public class Linkedhasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer>map = new LinkedHashMap<String,Integer>();
		  map.put("acc", 10);
		 map.put("TCS", 12);
		  map.put("CAPG", 16);
		  map.put("Delloite", 20);
		  map.put("TCS", 24);
		  
		  
		  System.out.println(map);
		map.forEach((k,v)->System.out.println(k+v));
	}

}
