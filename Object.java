package kranthi;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Model, int hp, String type, int year, String brand , int seats,int cost
		Kcar kc=new Kcar("yamaha", 2000, "bike", 2020, "bajaj", 2, 10000);
		kc.print();
		kc.getseats();
		System.out.println("no of seats :"+kc.getseats());
		System.out.println(" sale status :");
		kc.forssale();
		
 
	}

}
