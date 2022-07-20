import java.util.*;
class Codechef
{	
	
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		while(t1-->0){
			int D= sc.nextInt();
			int d = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((d*D)>=42) {
				System.out.println(c);
			}else if((d*D)>=21) {
				System.out.println(b);
			}else if((d*D)>=10) {
				System.out.println(a);
			}else {
				System.out.println(0);
			}
			
		}	
	}
}