package javaConcepts;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="I am the best";
   
   
   String[] a=str.split(" ");
   
   for(int i=a.length-1;i>=0;i--)
   {
	   System.out.print(a[i]+" ");
   }
	}

}


