package javaConcepts;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String,Integer> map=new HashMap<>();
  map.put("acc", 10);
  map.put("TCS", 12);
  map.put("CAPG", 16);
  map.put("Delloite", 20);
  map.put("TCS", 24);
  
  System.out.println(map.size());
  System.out.println(map.get("TCS"));
  
  map.forEach((k,v)->System.out.println(k+":"+v));
  
	}

}
