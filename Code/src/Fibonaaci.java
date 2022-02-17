import java.util.Scanner;
public class Fibonaaci {

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
			System.out.print(0+" "+1+" ");
	
		for(int i=2;i<=n;i++)
		{
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}

	}

}
