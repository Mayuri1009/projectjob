package Session;

public class switchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String browser ="firefox";
	
	switch(browser)
	{
	case "Chrome":
	  System.out.println("Chrome");
	  break;
	  
	case "firefox":
		System.out.println("firefox");
		break;
	  
	
	case "safari":
		System.out.println("safari");
		
		
		default:
			System.out.println("Please select right browser");
	}

	}

}
