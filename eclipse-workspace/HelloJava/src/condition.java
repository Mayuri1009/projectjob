import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    System.out.println("Enter your age :");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    
    System.out.println(a);
    
    if(a==18) {
    	System.out.println("adult");
    }
    else if(a==19){
    	System.out.println("child");
    }
    
}
}
	
