package com;

public class FactorsOfArrayElements {
	public static void main(String[] args)
	{
		int []a= {1,3,4,5,6};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
