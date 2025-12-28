package javaProgramms;

import java.util.LinkedHashSet;

public class Test1 {
	
	
	public static void removeDuplicates(int arr[])
	{
		
		LinkedHashSet<Integer>a= new LinkedHashSet<>();
	    
		for(int i=0;i<arr.length;i++)
		{
		  a.add(arr[i]);
		}
		
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str="bananana";
//		int count[]=new int[256];
//		
//		for(int i=0;i<str.length();i++)
//		{
//			count[(int)str.charAt(i)]++;
//		}
//		
//		for(int i =0;i<256;i++)
//			
//		{
//			if(count[i]!=0)
//			{
//			System.out.println((char)i+"-"+count[i]);
//			}
//		}
//		
		int arr[]= {1,8,8,5,9,9,9,5};
		
		removeDuplicates(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
 	}



