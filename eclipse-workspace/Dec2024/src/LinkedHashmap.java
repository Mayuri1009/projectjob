import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jas order dil tas bhetate 
  LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
  map.put("mayuri", 1);
  map.put("pinki",2);
  map.put("suresh", 3);
  
  System.out.println(map);
  
  map.forEach((k,v)-> System.out.println(k+":"+v));
	}

}
