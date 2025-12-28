import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		map.put("mayuri",1);
		map.put("pinki", 2);
		map.put("aniket", 2);
		map.put("Aniket", 2);
		map.put("1", 2);
		map.put("$", 2);
		
		System.out.println(map);

	}

}
