import java.util.Scanner;

public class Main 
{
	public static void main(String arg[])
	{
		/*
		int[] tab = new int[20];
		
		for(int i = 0; i < 20; i++)
			tab[i] = i + 1;
		
		for(int a : tab)
			System.out.println(a);
	
		//matrici
		
		int[][] mat = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				{
					mat[i][j] = k;
					k+=2;
				}
	
		System.out.println("Matricea este:");
		
		for(int[] a:mat)
		{
			for(int b:a)
				if(b < 10) System.out.print(b + "  ");
				else System.out.print(b + " ");
			
			System.out.print("\n");
		}
		*/
		
		Scanner key = new Scanner(System.in);
		
		int nr_linii, nr_coloane;
		int[][] mat;
		
		System.out.print("Dati numarul de linii: ");
		nr_linii = key.nextInt();
		
		System.out.print("\nDati numarul de coloane: ");
		nr_coloane = key.nextInt();
		
		key.close();
		
		mat = new int[nr_linii][nr_coloane];
		
		for(int i = 0; i < nr_linii; i++)
			for(int j = 0; j < nr_coloane; j++)
				mat[i][j] = i + j + 1;
		
		System.out.print("\n\nMatricea este: \n");
		
		for(int[] line:mat)
		{
			for(int elem:line)
				System.out.print(elem + " ");
			
			System.out.print("\n");
		}
	}	
		
}
