package javaConcepts;

public class Mathod1 {
	
	public int sum(int a,int b)
	{
		 int sum=a+b;
		//return sum;
		System.out.println(sum);
		return sum;
	}
	
	public void test()
	{
		System.out.println("calling method test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mathod1 ex=new Mathod1();
		ex.test();
		
		int a=ex.sum(10, 20);
		System.out.println("sum print vr keli ahe");
	}

}
