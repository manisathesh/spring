package com.basics;
//PRaveen comment
import java.util.Scanner;
class Perform
{
	int val2;

	Perform (int val1)
	{
		val2=val1;
	}
	
	void Run() 
	{
		int cp=val2;
		int temp=0;
		while(val2>0)
		{
			int t=val2%10;
			  temp=temp+(t*t*t);
			 val2=val2/10;
		}
		String s=temp==cp?"Amstrong":"Not an Amstrong";
		System.out.println(s);
	}
	}

public class Amstrong
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter the value");
int val=scn.nextInt();
Perform rep=new Perform(val);
rep.Run();


}
}
