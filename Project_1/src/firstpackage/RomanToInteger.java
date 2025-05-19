package firstpackage;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int pv=0;
		int t=0;
		int cv=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			
			if (c == 'I') 
			{
                cv = 1;
            }
			else if (c == 'V') 
            {
                cv = 5;
            }
			else if (c == 'X') 
            {
                cv = 10;
            }
			else if (c == 'L') 
            {
                cv = 50;
            }
			else if (c == 'C')
            {
                cv = 100;
            }
			else if (c == 'D')
            {
                cv = 500;
            }
			else if (c == 'M')
            {
                cv = 1000;
            }
			
			if(cv<pv)
			{
				t-=cv;
			}
			else
			{
				t+=cv;
			}
			pv=cv;
		}
		System.out.println(s+" ---> "+t);
		sc.close();
	}

}
