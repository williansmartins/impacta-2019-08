package pacote;

public class Fibo {
	
	public static int fibonacci(int x)
	{
		if((x > 0) && (x == 1))
		{
			System.out.println(x + " ");
		}
		else if(x == 2)
		{
			System.out.println((x-1) + " ," + (x-1));
		}
		else
		{
			return (fibonacci(x-1) + fibonacci(x-2));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
}
