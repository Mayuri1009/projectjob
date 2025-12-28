package javaConcepts;

public class Methodoverloading {
	
	
	public void test(String shirt)
	{
		System.out.println("nike");
	}

	public void test(String shirt,String color)
	{
		
	}
	
	public void test(String shirt,String color,int price)
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading obj=new Methodoverloading();
		obj.test("nike");
		obj.test("nike","pink");
				

	}

}
