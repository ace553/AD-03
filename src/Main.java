public class Main
{

	public static void main(String[] args)
	{
		PascalTriangle tri = new FastPascalTriangle();
		for(int i = 1; i < 100; i++)
		{
			long[] line = tri.line(i);
			for(int k = 0; k < line.length; k++)
			{
				if(line[k] < 0)
				{
					System.out.println(i);
					return;
				}
			}
		}
	}
	
	public static void test()
	{
		PascalTriangle tri = new FastPascalTriangle(); //Overflow bei 63;
		PascalTriangle tri1 = new RecursivePascalTriangle(); //Overflow bei 68;
		PascalTriangle tri2 = new IterativePascalTriangle(); //Overflow bei 68;
		for(int i = 1; i < 20; i++)
		{
			tri.line(i);
			tri1.line(i);
			tri2.line(i);
			
			System.out.printf("%d,%d,%d,%d\n",i, tri.getOperations(), tri1.getOperations(), tri2.getOperations());;
			tri.resetOperations();
			tri1.resetOperations();
			tri2.resetOperations();
		}
	}
}
