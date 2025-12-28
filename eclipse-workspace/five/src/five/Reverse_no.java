package five;

public class Reverse_no {

	public static void main(String[] args) {
		
		int input=12345;
		int result=0;
		int remainder=0;
		
		while( input > 0) {
			 remainder=input%10;
			 result=result*10+remainder;
			input=input/10;
			
		}
		
		
		
		System.out.println(result);
		
	 
	}}
