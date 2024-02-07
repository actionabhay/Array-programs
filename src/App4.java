public class App4 
{
	public static void main(String[] args) 
	{
		String str="abhaykumarchaudhary";
		char[] ch=str.toCharArray();
		int vowelCount=0;
		for(char c:ch)
		{
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
				vowelCount++;
			}
		}
		System.out.println("Total vowels are:"+vowelCount);
	}
}
