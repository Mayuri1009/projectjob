
public class StringSpitProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		String str="New job in 2025";
		String nstr=" ";
		String[] rev=str.split("\\s");
		for(int i=rev.length-1;i>=0;i--)
		{
			nstr=nstr+rev[i]+" ";
		}
		
		System.out.println(nstr);
		
	}

}
