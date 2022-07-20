import java.util.*;
class Codechef
{	
	
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		while(t1-->0){
			int arr[] = new int[6];
			for(int i =0;i<6;i++) {
				arr[i] = sc.nextInt();			
			}
			
			
			if(arr[0]<=arr[1] && arr[2]<=arr[3] && arr[5]<=arr[4]) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}	
	}
}