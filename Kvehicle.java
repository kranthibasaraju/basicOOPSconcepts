package kranthi;




public class Kvehicle {
	int year,hp;
	static String transmission;
	String type,model;
	String Brand;
	
	public Kvehicle(String Model,int hp,String type,int year,String brand) 
	{
		this.hp=hp;
		this.type=type;
		this.year=year;
		this.Brand=brand;
		this.model=Model;	
}
	
public static String getTransmission()	{
	 return transmission;
}
	
	void print()
    {
        System.out.println("vehicle type is: "+gettype());
        System.out.println("model is: "+getmodel());
        System.out.println("brand is: "+getbrand());
    }
	public  String getbrand() {
		// TODO Auto-generated method stub
		return Brand;
	}

	public String getmodel()
	{
		return model;
	}
	public String gettype()
	{
		return type;
	}
	public void details()
    {
        System.out.println("hp is : "+this.hp);
        System.out.println("transmission is  : "+this.transmission);
        System.out.println("type  is : "+this.type);
    }
	
}

    
	