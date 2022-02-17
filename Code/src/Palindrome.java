import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		String str;
		String str1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		str = sc.nextLine();
		char ch;
		for(int i=0; i<str.length();i++)
		{
			ch = str.charAt(i);
			str1 = ch +str1; 
		}
		System.out.println(str1);
		if(str.equals(str1))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}

}
