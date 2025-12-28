import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer> ();
		arr.add(20);
		arr.add(50);
		arr.add(100);
		
		System.out.println(arr);
	
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)==50)
			{
				break;
			}
		}
		
		System.out.println(arr);

				
	}
						

}
