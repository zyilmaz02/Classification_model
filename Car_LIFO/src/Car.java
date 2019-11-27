import java.util.Scanner;

public class Car {
	public String make;
	public String model;
	public int year;
	public int mileage;
	public float price;
	
	Car() {
		System.out.println("please enter the Car maker: ");
		this.make=new Scanner(System.in).nextLine();
		System.out.println("Please enter the Car Model: ");
		this.model=new Scanner(System.in).nextLine();
		System.out.println("Please enter the Car year:");
		this.year=Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Please enter the Car mileage:");
		this.mileage=Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Please Enter the Car price");
		this.price=Float.parseFloat(new Scanner(System.in).nextLine());
	}
	

}
