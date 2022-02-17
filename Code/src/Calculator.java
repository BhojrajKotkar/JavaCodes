import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter Your Choice: \n 1.Add\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Exit");
			int choice;
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter two numbers: ");
				x = sc.nextInt();
				y = sc.nextInt();
				int sum = 0;
				sum = x+y;
				System.out.println("Addition  = "+sum);
				break;
				
			case 2:
				System.out.println("Enter two numbers: ");
				x = sc.nextInt();
				y = sc.nextInt();
				int sub=0;
				sub = x-y;
				System.out.println("Substraction = "+sub);
				break;
				
			case 3:
				System.out.println("Enter two numbers: ");
				x = sc.nextInt();
				y = sc.nextInt();
				int mult = 0;
				mult = x*y;
				System.out.println("Multiplication = "+mult);
				break;
				
			case 4:
				System.out.println("Enter two numbers: ");
				double a,b;
				a = sc.nextInt();
				b = sc.nextInt();
				double div =0;
				div = a/b;
				System.out.println("Division = "+div);
				break;
				
			case 5:
				System.exit(0);
			}
		}
	}

}
