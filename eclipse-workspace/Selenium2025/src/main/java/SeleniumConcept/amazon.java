package SeleniumConcept;

import java.util.LinkedHashSet;

public class amazon {
	
	public static void remove(int a[])
	{
		LinkedHashSet<Integer>ab=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			ab.add(a[i]);
		}
		
		System.out.println(ab);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int a[]= {5,8,4,7,8,8,8,};
		
		remove(a);
	}
}
