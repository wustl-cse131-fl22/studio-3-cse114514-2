package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("input your target number:");
		int n=scan.nextInt();  ///input target number n
		int[] total= new int[n-1];    /// 2~n  there are (n-1) numbers
		for(int i=0;i<n-1;i++)
		{
			total[i]=i+2;
			for(int a=2;a<=Math.sqrt(total[i]);a++)
			{
				if(i>1&&total[i]%a==0)
				{
					total[i]=0;
					break;
				}

			}
			
			if(total[i]!=0)
			{
				System.out.println(total[i]);
			}
		
			
		}
			
		
			
		
		}	
}		


