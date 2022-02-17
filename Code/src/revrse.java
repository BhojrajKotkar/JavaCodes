import java.util.Scanner;

public class revrse
{
	public static void main(String ar[])
	{
		String str;
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char ch;
		String revstr = "";
		for(int i=0; i<str.length();i++)
		{
			ch = str.charAt(i);
			revstr = ch+revstr;
		}
		System.out.println("Reversed String = "+revstr);
	}

}
