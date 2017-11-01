
public class RecursivePascalTriangle implements PascalTriangle
{
	private int operations = 0;
	
	
	public int getOperations()
	{
		return operations;
	}
	
	public void resetOperations()
	{
		this.operations = 0;
	}
	
	@Override
	public long[] line(int n)
	{
		operations++;
		return nextLineRecusive(new long[] { 1 }, n);
	}

	private long[] nextLineRecusive(long[] line, int n)
	{
		operations++;
		if (line.length == n)
		{
			operations++;
			return line;
		}

		operations+=3;
		long[] next = new long[line.length + 1];
		next[0] = 1;
		next[next.length - 1] = 1;
		
		for (int i = 1; i * 2 <= line.length; i++)
		{
			operations+=2;
			next[i] = line[i] + line[i - 1];
			next[next.length - 1 - i] = next[i];
		}
		operations++;
		return nextLineRecusive(next, n);
	}
}
