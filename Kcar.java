package kranthi;

public class Kcar extends Kvehicle {

	public Kcar(String Model, int hp, String type, int year, String brand , int seats,int cost) {
		super(Model, hp, type, year, brand);
		this.seats=seats;
		this.cost=cost;
	}
	
int present=2018;
int seats;
static int cost;
public static int getcost()
{
	return cost;
}
public int getseats()
{
	return seats;
}
public void forssale()
{
	if(this.present - this.year>=3)
	{
		this.cost=this.cost/2;
				
	}
	else if(this.present - this.year>=4)
	{
		this.cost=this.cost/3;
				
	}
	else if(this.present - this.year>=9) 
	{
		this.cost=this.cost/5;
	}
	else {
		 System.out.println("Not for sale ");
	}
}
}
