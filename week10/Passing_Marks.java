import java.util.*;
class Codechef
{	
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		while(t1-->0){
			int a= sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int tmin = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C= sc.nextInt();
			if(A<a || B<b || C<c) {
				System.out.println("NO");
			}else {
				if((A+B+C)<tmin) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
		}	
	}
}