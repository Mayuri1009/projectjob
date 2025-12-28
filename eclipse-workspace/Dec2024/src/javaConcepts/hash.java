package javaConcepts;

import java.util.HashMap;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("mayuri",15);
		a.put("pinki", 6);
		
		a.forEach((k,v)->System.out.println(k+v));
		

	}

}
