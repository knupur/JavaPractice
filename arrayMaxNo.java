/* 2) Write a program to find the maximum number present in an array */


class arrayMaxNo
{
	public static void main(String args[])
	{
		int arr[] = new int[]{10, 11, 88, 2, 12, 120};
		int max = arr[0]; 
		for(int i=1;i < arr.length;i++)
		{ 
		  if(arr[i] > max)
		  { 
			 max= arr[i]; 
			 
			 
		  }
		} 
		System.out.println("Maximum Value is: "+max);
	}
}