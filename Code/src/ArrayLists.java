import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayLists {

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Array List = "+list);
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an index array to be delete: ");
		n = sc.nextInt();
		list.remove(n);
		System.out.println("Array List = "+list);
		

	}

}
