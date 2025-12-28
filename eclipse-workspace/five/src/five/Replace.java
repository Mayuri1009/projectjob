package five;

public class Replace {

	public static void main(String[] args) {
		
		int count=0;
		int i;
		String input="corona";
		 char a[]=input.toCharArray();
		 for(i=0;i<=a.length;i++) {
			 if(a[i]=='o') {
				 count++;
				 
				 for(int j=0;j<count;j++) {
					 a[i+j]='*';
					 
				
				 }
				 i=i+count;
			 }
			 
			 
		 }
		 System.out.println(a[i]);
	}
}
