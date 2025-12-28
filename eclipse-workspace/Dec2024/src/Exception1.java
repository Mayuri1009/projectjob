
public class Exception1 {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println("in");
		
		Exception1 obj=new Exception1();
		obj=null;
		obj.name="naveen";
		
				
		try {
			int num=9;
			int c=num/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Arithmatic");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("NullPointer");
		}
	

}
}
