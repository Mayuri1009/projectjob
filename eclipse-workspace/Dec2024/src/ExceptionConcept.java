
public class ExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		
		
		int a=10;
		int b=0;
		
		
		try {
		int c=a/b;
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Replace value og b");
		}
		
		
    
		//System.out.println(a/b);
		
	}

	}


