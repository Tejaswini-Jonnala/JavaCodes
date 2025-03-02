package com;

public class ProductOfHalfArray {
	public static void main(String[] args)
	{
		int  []a= {1,2,3,4,5,6,7,8};
		int product=1;
		for(int i=0;i<=(a.length/2)-1;i++)
		{
		product=product*a[i];	
		}
		System.out.println(product);
		
	}

}
