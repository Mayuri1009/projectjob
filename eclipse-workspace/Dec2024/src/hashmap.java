import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> e=new HashMap<Integer,String>();
		e.put(1, "mayuri");
		e.put(2, "pinki");
		e.put(3, "bute");
		
		//e.forEach((k,v)-> System.out.println(k+":"+v));
		
		e.forEach((k,v)-> System.out.println(k+":"+v));
		
		System.out.println(e.get(1));
		
		
		
	}

}
