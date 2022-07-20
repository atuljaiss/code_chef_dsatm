import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		while(t1-->0){
			
			int r = sc.nextInt();
			if(r>=2000) {
				System.out.println(1);
			}else if(r>=1600 && r<2000) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
			
		}	
	}
}