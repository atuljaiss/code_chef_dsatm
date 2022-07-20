import java.util.*;
import java.lang.*;
import java.io.*;

/* 8 test cases passed , 2 failed */

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		while(t1-->0){
			long x= sc.nextLong();
			long y = sc.nextLong();
			long z = sc.nextLong();
			
			long  divisibleY = (long) Math.pow(10, 18)/y;
			long  divisibleZ = (long) Math.pow(10,18)/z;
			long lcm = (y*z)/ gcd(y,z);
			long divisibleByLCM = (long) Math.pow(10, 18)/lcm;
			long divisibleYorZ = (divisibleY + divisibleZ) - divisibleByLCM ;
			long count =  divisibleYorZ - divisibleZ;
			if(count == 0) {
				System.out.println(-1);
			}else {
				long m = x/y;
				for(long i = y*(m+1); i <Math.pow(10, 18);i=i+y) {
					if(i%y==0 && i%z!=0) {
						System.out.println(i);
						break;
					}
				}
			}
			
		}	
	}

	private static long gcd(long y, long z) {
		// TODO Auto-generated method stub
		if(z == 0)
			return y;
		return gcd(z,y%z);
	}
}