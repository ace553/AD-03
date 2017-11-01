
public class FastPascalTriangle implements PascalTriangle
{

	private int operations = 0;

//	@Override
//	public long[] line(int n)
//	{
//
//		operations+=6;
//		
//		long[] line = new long[n];
//		long x = 1;
//		long y = 1;
//		long z = 1;
//		line[0] = x;
//		line[n - 1] = x;
//		for (int i = 1; 2 * i < n; i++)
//		{
//			operations+=5;
//			x *= (n - i);
//			y *= i;
//			z = x / y;
//			line[i] = z;
//			line[(n - 1) - i] = z;
//		}
//		return line;
//	}
	
	@Override
	public long[] line(int n)
	{

		operations+=6;
		
		long[] line = new long[n];
		long x = 1;
		line[0] = x;
		line[n - 1] = x;
		for (int i = 1; 2 * i <= n; i++)
		{
			operations+=4;
			x *=  (n - i);
			x /= i;
			
			line[i] = x;
			line[(n - 1) - i] = x;
		}
		return line;
	}
	@Override
	public int getOperations()
	{
		return operations;
	}

	@Override
	public void resetOperations()
	{
		operations = 0;
	}
}
