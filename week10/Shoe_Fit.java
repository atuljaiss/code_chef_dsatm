import java.util.*;
class Codechef
{	
	
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		while(t1-->0){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if((a+b+c)>0 && (a+b+c)<3) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			
		}	
	}
}