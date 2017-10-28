import java.io.*;

public class Main 
{
	public static void main(String argv[])
	{
		int[][] mat1, mat2;
		int n, m;
		String fis, fis_ies;
		try{
			
			BufferedReader input = new BufferedReader
					(new InputStreamReader(System.in));
			
			System.out.print("Din ce fisier sa citim?\nRaspuns: ");
			fis = input.readLine();
			
			System.out.print("In ce fisier sa afisam rezultatul?\nRaspuns: ");
			fis_ies = input.readLine();
			
			input.close();
			
			BufferedReader input_file = new BufferedReader
					(new InputStreamReader (new FileInputStream(fis)));
			
			PrintStream output_file = new PrintStream
					(new FileOutputStream(fis_ies));
			
			
			n = Integer.parseInt(input_file.readLine());
			m = Integer.parseInt(input_file.readLine());
			
			mat1 = new int[n][m];
			mat2 = new int[n][m];
			
			for(int i = 0; i < n; i++)
				for(int j = 0; j < m; j++)
					mat1[i][j] = Integer.parseInt(input_file.readLine());
			
			for(int i = 0; i < n; i++)
				for(int j = 0; j < m; j++)
					mat2[i][j] = Integer.parseInt(input_file.readLine());
			
			input_file.close();
			
			output_file.println("\nPrima matrice este: \n");
			
			for(int[] line:mat1)
			{
				for(int el:line)
					output_file.print(el + " ");
				
				output_file.println("\n");
			}
			
			output_file.println("\nA doua matrice este: \n");
			
			for(int[] line:mat2)
			{
				for(int el:line)
					output_file.print(el + " ");
				
				output_file.println("\n");
			}
			
			output_file.println("\nRezultatul adunarii celor 2 matrici este: \n");
			
			for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < m; j++)
						output_file.print( (mat1[i][j] + mat2[i][j]) + " ");
					
					output_file.println("\n");
				}
				
			
			output_file.close();
			
			System.out.print("\nDatele au fost salvate in fisierul: " + fis_ies);
			
		}catch(IOException e)
		{
			System.out.println("Eroare la prelucrarea fisierelor!");
			System.exit(1);
		}
	}
	
}
