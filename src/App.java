public class App 
{
	public static void main(String[] args) 
	{
		//int[] num1=new int[2];   // decleration type
		int[] num= {14,35,167,57,23,4556,13243,23,461};
		//Display those number from the array that has only two digits
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>=10 && num[i]<=99)
			{
				System.out.println(num[i]);
			}
		}
	}
}
