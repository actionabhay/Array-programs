public class App5 
{
	public static void main(String[] args) 
	{
		String str="Rehan Ahmad";
		String temp=str.toLowerCase();  // to string method 
		char[] ch=temp.toCharArray();
		int vowelCount=0;
		for(char c:ch)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				vowelCount++;
			}
		}
		System.out.println("Total vowels are:"+vowelCount);
	}
}
