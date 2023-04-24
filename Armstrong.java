package com.pract;
import java.util.Scanner;
public class Armstrong {

	static boolean isarmstrong(int n)
	{
		int sum=1,s=0,l=0,d=0,temp;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			d++;
		}
		temp=n;
		while(temp>0)
		{
			l=temp%10;
		     sum=1;
			for(int i=1;i<=d;i++)
			{
				sum=sum*l;
			}
			
			System.out.println(sum);
			s=s+sum;
			temp=temp/10;
		}
		
		if(s==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		if(isarmstrong(n)==true)
			System.out.println("Armstrong num");
		else
			System.out.println("not Armstrong num");
	}

}
