import java.util.*;
 
public class GCD 
{
	public int findgdc (int a,int b) {
		
		int r,r1,r2,s,s1,s2,t,t1,t2;
		r1=a;
		r2=b;
		s1=1;
		s2=0;
		s=s2;
		t1=0;
		t2=1;
		t=t2;
		if(r2==0) {
			t=t1;
			s=s1;
			System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s", "R1", "R2","S", "S1", "S2","T", "T1","T2");
		    System.out.println();
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    
		    System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s",
	                r1, r2,s, s1, s2,t, t1, t2);
	        System.out.println();
	        System.out.println("\n"+"The greatest common divisor of " +a+" and  "+b+" is GCD :" +r1+ " and the 'S'is  :" +s+" and the 't' is :"+t);
		}
		else {
		int q=r1/r2;
		System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s", "Q", "R1", "R2", "S","S1", "S2","T", "T1","T2");
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------------------------------------");
	    
	    System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s",
                q,r1, r2,s, s1,s2,t, t1, t2);
        System.out.println();
		while (r2>0) {
        r=r1-q*r2;
        r1=r2;
		r2=r;
			s=s1-q*s2;
			s1=s2;
			s2=s;
			t=t1-q*t2;
			t1=t2;
			t2=t;	
			if(r2!=0)
				q=r1/r2;
			else
				q=0;
			s=s1;
			t=t1;
			System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s",
	                q,r1, r2, s,s1, s2,t, t1, t2);
	        System.out.println();
			
	    } 
		
		
		System.out.println("\n"+"The greatest common divisor of " +a+" and  "+b+" is GCD :" +r1+ " and the 'S'is  :" +s1+" and the 'T' is :"+t1);
		
		return r2;
		
	}
return r2;
}}

