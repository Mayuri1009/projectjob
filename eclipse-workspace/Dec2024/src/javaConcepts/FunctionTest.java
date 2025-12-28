package javaConcepts;

public class FunctionTest {

	public int studentName(String name)
	{
		System.out.println("student name= "+name);
		
		int marks=-1;
		
		if(name.trim().equalsIgnoreCase("devika"))
		{
			marks=90;
			//return 90;
			System.out.println(marks);
		}
		
		if(name.trim().equalsIgnoreCase("ravi"))
		{
			marks=100;
			//return 100;
			System.out.println(marks);
		}
				
		return marks;
	}
	public boolean launchbrowser(String browsername)
	{
		System.out.println("browsername"+browsername);
		
		switch (browsername.trim().toLowerCase()) {
		case("chrome"):
			System.out.println("CHROME");
			return true;

		default:
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionTest a=new FunctionTest();
		a.studentName("devika");

		a.studentName("ravi");
	}

}
