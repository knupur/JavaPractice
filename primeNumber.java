/* 4)   Write a program to print the prime number coming between 1 to 100. */ 

class primeNumber
{
	public static void main(String args[])
	{
		String primeNos ="";
		for (int i = 1; i <= 100; i++)         
       { 		  	  
          int cnt=0; 	  
		  for(int n = i; n >= 1; n--)
		  {
			  if(i%n==0)
			 {
				cnt= cnt + 1;
			 }
		  }
			
		  if (cnt ==2)
		  {
			 primeNos =  primeNos + i + " ";
		  }	
       }	
		   System.out.println("Prime numbers from 1 to 100 are :");
		   System.out.println(primeNos);
	}
}