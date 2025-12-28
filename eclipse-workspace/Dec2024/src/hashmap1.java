import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap will print random entries
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("mayuri",1);
		map.put("pinki",2);
		map.put("Snehal", 3);
		
		
		System.out.println(map);
		
	map.forEach((k,v) -> System.out.println(k+":"+v));
	
 
	}

}
