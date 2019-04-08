/* 3) Write a program to print the even number coming between 1 to 100. */ 

class evenNumber
{
	public static void main(String args[])
	{
		System.out.println("Printing Even numbers between 1 and 100");
		
		for(int i=1; i <= 100; i++)
		{
			
			if( i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}