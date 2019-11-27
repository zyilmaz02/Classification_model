import java.util.*;

public class GCDTEST {
	

	public static void main(String[] args) {
		GCD l= new GCD();
		int a;
		int b;
		System.out.println("please enter first pozitif number:");
		a=Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("please enter second pozitif number");
		b=Integer.parseInt(new Scanner(System.in).nextLine());
	    while(a<0||b<0) {
	    	System.out.println("at least one of the numbers that you have entered is not pozitif");
	    	System.out.println("\n"+"please enter first pozitif number:");
			a=Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.println("please enter second pozitif number");
			b=Integer.parseInt(new Scanner(System.in).nextLine());
          }
	    
	   
	    	if(a<b) {
	    		int temp=b;
	    		b=a;
	    		a=temp;
	    		l.findgdc(a, b);	
	    		}
	    	else
	    		l.findgdc(a, b);

}
}