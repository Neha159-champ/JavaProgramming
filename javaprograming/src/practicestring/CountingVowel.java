package practicestring;

public class CountingVowel {
public static void main(String[] args) {
	String input="I Am Neha Gupta";
	int count=0;
	for(int i=0;i<input.length();i++)
	{
		if(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u") ) 
		{
			count++;
			
		}
	}
	
	System.out.println(count);
}
}
