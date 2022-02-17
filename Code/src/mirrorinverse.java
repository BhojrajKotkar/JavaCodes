
public class mirrorinverse {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,0};
		if(mirrorinverse(arr))
		{
			System.out.println("Yes it is mirror inverse array.");
		}
		else
		{
			System.out.println("No, it's not mirror inverse array.");
		}
	}
	public static boolean mirrorinverse(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[arr[i]]!=i)
			{
				return false;
			}

		}
		return true;
	}
}
