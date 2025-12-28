package javapro;

public class reverse {
	
	public static void main(String[] args)
	{
	
	
	String str="mayuri Bute";
    String[] nstr=str.split(" ");
    
    for(int i=nstr.length-1;i>=0;i--)
    {
    	System.out.println(nstr[i]);
    }
}
}