package five;

public class ReplaceStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   String input="corona";

		   int count=0;
		        int i;
		        int k=0;

			char[] input_array= input.toCharArray();

			int input_arraysize=input_array.length;

			char[] output=new char[100];

			for(i=0;i<input_arraysize;i++)
			{
			   
			    if(input_array[i]=='o')
			    { 
			    	count++;

			    	for(int j=0;j<count;j++)
			    	{
			             output[k+j]='*';
			               // k++;
                    }
			    	k=k+count;
			    }
			else
		    {
		       output[k]=input_array[i];
		       k++;
			}
			}
            for(i=0;i<output.length;i++) 
            {
            	System.out.print(output[i]);
            }
            }

		}


