import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{
		PascalTriangle tri = new FastPascalTriangle(); //Overflow bei 20;
		PascalTriangle tri1 = new RecursivePascalTriangle(); //Overflow bei 35;
		PascalTriangle tri2 = new IterativePascalTriangle(); //Overflow bei 35;
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
