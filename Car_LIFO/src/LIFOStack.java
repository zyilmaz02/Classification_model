import java.util.Scanner;
public class LIFOStack {

	public static void main(String[] args) {
	 LinkedList LL = new LinkedList();
	 System.out.println("Please enter number of the Car to push:");
	 int n= Integer.parseInt(new Scanner(System.in).nextLine());
	 
	 for(int i=0 ; i<n; i++) {
		 Car theitem= new Car();
		 LL.append(theitem);
	 }
	 
	 System.out.printf("Please Enter 1 for Push " +"\n"+"Please Enter 2 for Pop" +"\n"+"Please enter 3 for Display:"+"\n");
	 int s = Integer.parseInt(new Scanner(System.in).nextLine());
	 while (s == 1 || s == 2 || s==3) {
		 if(s == 1) {
			 Car item = new Car();
			 LL.append(item);
		 };
		 if(s == 2) {
			    Node x=LL.remove();
			    System.out.println("removed Car is ");
				System.out.printf("Make = %s Model= %s year= %d Mileage=%d Price=%.2f",x.item.make,x.item.model,x.item.year,x.item.mileage,x.item.price);
				System.out.println("\n");
			
			 
	 };
	 if( s == 3) {
		 LL.print();
	 }
	 System.out.printf("Please Enter 1 for Push " +"\n"+"Please Enter 2 for Pop" +"\n"+"Please enter 3 for Display:"+"\n");
	 s = Integer.parseInt(new Scanner(System.in).nextLine());
	}
   }
}
