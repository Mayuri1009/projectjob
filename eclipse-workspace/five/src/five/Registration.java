package five;

public class Registration {


public static void main(String args[]) {

	String input="corona";

	int count=0;
	
	int i;
	

	char[] input_array= input.toCharArray();

	int input_arraysize=input_array.length;

	char[] output=new char[100];

	for( i=0;i<input_arraysize;i++)
	{
	   
	    if(input_array[i]=='o')
	    {

	count++;
	    }
	    else 
		{
	      output[i]=input_array[i];
		}
	for(int j=0;j<count;j++)
	{
	   
	    output[i+j]='*';
	
	}
	    
	
 }
 System.out.println(output[i]);
		
	}

}
