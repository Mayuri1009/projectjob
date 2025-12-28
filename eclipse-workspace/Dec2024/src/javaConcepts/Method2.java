package javaConcepts;

public class Method2 {
	
	public void sum(int a,int b)
	{
		int sumOf=a+b;
		
		System.out.println(sumOf);
	}
	
	public static void sub(int a,int b)
	{
		int subOf=a-b;
		
		System.out.println(subOf);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Method2 a=new Method2();
		
		a.sum(10, 20);
		
		Method2.sub(50, 10);
	}

}
