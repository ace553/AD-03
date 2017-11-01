
public class IterativePascalTriangle implements PascalTriangle
{

	int operations = 0;

	@Override
	public long[] line(int n)
	{
		operations+=4;
		long[] line = new long[n];
		long[] lineNext = new long[n];
		long[] temp = null;
		line[0] = 1;

		int curr = 1;
		while (line[n - 1] == 0)
		{
			for (int i = 0; i < curr+1; i++)
			{
				if (i == 0)
				{
					operations+=2;
					lineNext[i] = 1;
					continue;
				} else
				{
					operations++;
					lineNext[i] = line[i] + line[i - 1];
				}
			}

			operations+=4;
			curr++;
			temp = line;
			line = lineNext;
			lineNext = temp;
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
