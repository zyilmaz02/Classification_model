


import java.util.*;
import java.math.BigInteger;
import java.security.SecureRandom;


public class RSA {
	
	public static void main(String[] args) {
		
	

	 int low=3000;
	 int high=5000;
	 boolean remain=false;
	 int p=0;
	 int q=0;
	 
	 while(remain=false) {
		 		Random random = new Random();
		 		p= random.nextInt(high - low) + low;
		 		for(int i=2;i<p/2;i++) {
		 			int left=p%i;
		 			if(left==0) {
		 				remain=false;
		 				break;
		 			}
		 			
		 			}

		
 }
	 q=p*2+1;
	System.out.print("first out:"+p+"second"+q); 
}
	
 }