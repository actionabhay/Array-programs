 public class App3 
{
	public static void main(String[] args) 
	{
		int[] num= {14,35,167,50,23,4556,13243,23,461};
		//Display total no of evens and odds
		int evenCount=0;
		for(int n:num)
		{
			if(n%2==0)
			{
				evenCount++;
			}
		}
		//int oddCount=num.length-evenCount;
		System.out.println("Total evens are:"+evenCount);
		//System.out.println("Total odds are:"+oddCount);
		System.out.println("Total odds are:"+(num.length-evenCount));
		
	}
}
