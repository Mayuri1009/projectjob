package javaConcepts;

public class Car {

	
	String name;
	String number;
	String color;
	 static int wheels=4;  //ithe wheels common ahe mhnun te static
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car c1=new Car();
         c1.name="bmw";
         c1.number="4444";
         c1.color="Black";
         
         Car c2=new Car();
         c2.name="audi";
         c2.number="524";
         c2.color="white";
         
         System.out.println(c1.name+" "+wheels);
         System.out.println(c2.name+" "+Car.wheels);
         
	}

}
