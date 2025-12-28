
public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mayuri is iceceamiam";
		
		
		System.out.println(str.indexOf("i"));
		//System.out.println(str.indexOf("i")+1);
		System.out.println(str.indexOf("i",str.indexOf("i")+1));
		
		System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i")+1)+1));
		
		System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i",str.indexOf("i")+1)+1)+1));
		
		

	}

}
