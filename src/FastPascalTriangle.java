
public class FastPascalTriangle implements PascalTriangle
{

	private int operations = 0;

	@Override
	public int[] line(int n)
	{

		operations+=6;
		
		int[] line = new int[n];
		int x = 1;
		int y = 1;
		int z = 1;
		line[0] = x;
		line[n - 1] = x;
		for (int i = 1; 2 * i < n; i++)
		{
			operations+=5;
			x *= (n - i);
			y *= i;
			z = x / y;
			line[i] = z;
			line[n - 1 - i] = z;
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
