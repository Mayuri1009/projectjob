
public class SIOBException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="wow";
		
		System.out.println(str.length());
		
		
		//System.out.println(str.charAt(5));  Exception came at this place
		
		
		try {
		System.out.println(str.charAt(5));
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("character is upto 3 index only");
		}
		
		
		

	}

}

