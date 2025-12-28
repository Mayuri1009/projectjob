package javaConcepts;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nstr=" ";
		char ch;
		String str="mayuri";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
			
		}

		System.out.println(nstr);
	}

}
