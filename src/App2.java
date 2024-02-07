public class App2 
{
	public static void main(String[] args) 
	{
		int[] num= {14,35,167,50,23,4556,13243,23,461};
		//Display those number from the array that are even
		for(int n:num)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
	}
}
