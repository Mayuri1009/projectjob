package javaProgramms;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	HashMap<String,Integer> emp=new HashMap<String,Integer>();
	emp.put("mayuri", 2019);
	emp.put("pooja", 219);
	
	System.out.println(emp);
	emp.forEach((k,v)->System.out.println(k+":"+v));
		
		
	}

}
