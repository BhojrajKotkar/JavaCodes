
public class TransposeMatrix {

	public static void main(String[] args)
	{
		int mat[][] = {{1,2,3},{4,5,6},{3,6,7}};
		
		int i,j;
		System.out.println("Given Matrix = ");
		for(i=0; i<mat.length; i++)
		{
			for(j=0; j<mat[i].length; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int transpose[][] = new int[3][3];
		for(i=0;i<mat.length;i++)
		{
			for(j=0; j<mat[i].length; j++)
			{
				transpose[i][j] = mat[j][i];
			}
		}
		
		System.out.println("Transpose Matrix = ");
		for(i=0; i<transpose.length; i++)
		{
			for(j=0; j<transpose[i].length; j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
