package firstpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Roman=sc.next();
		int result=romanToInt(Roman);
		System.out.println("The Integer valueof "+Roman+" is "+ result);
		sc.close();
	}
	
	public static int romanToInt(String s)
	{
		Map<Character,Integer>romanMap=new HashMap<>();
		romanMap.put('I',1);
		romanMap.put('V',5);
		romanMap.put('X',10);
		romanMap.put('L',50);
		romanMap.put('C',100);
		romanMap.put('D',500);
		romanMap.put('M',1000);
		
		int total=0;
		int preValue=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			int cv=romanMap.get(ch);
			
			if(cv<preValue)
			{
				total-=cv;
			}
			else
			{
				total+=cv;
			}
			preValue=cv;
		}
		
		return total;
		
	}

}
