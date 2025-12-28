package javaConcepts;

public class TCS implements It {

	public static void main(String[] args) {

      TCS company=new TCS();
      company.Emoployee();
      company.Service();

	}

	@Override
	public void Emoployee() {
		System.out.println("mayuri");
		
	}

	@Override
	public void Service() {
		// TODO Auto-generated method stub
		System.out.println("QA");
	}

}
