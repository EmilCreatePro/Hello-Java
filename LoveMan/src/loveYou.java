
public class loveYou {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		int x = 10, y = 20;
		
		if(x>y)
		{
			System.out.println("x is greater than y and x = " + x);
		
		}
		else 
			System.out.println("y is greater than x and y = " + y);
	
		
	int sum = 0;
	for(int i = 1; i <= 100; i++)
		{
			if(i%2!=0) 
				System.out.print(i + " ");//print the odd numbers
			else sum+=i;
		}
	
	System.out.print("\nSum = " + sum); // sum of the even numbers
	}
}
