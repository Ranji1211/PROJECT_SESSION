package firstpackage;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fc=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		if(fc==2)
		{
			System.out.println(n+" The number is Prime");
		}
		else
		{
			System.out.println(n+" The Number is Not prime");
		}
		
		sc.close();

	}

}
