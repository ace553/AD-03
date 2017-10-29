import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PascalTriangleTest
{

	PascalTriangle _tri;

	public PascalTriangleTest()
	{
		_tri = new IterativePascalTriangle();
	}

	@Test
	public void testTriangle()
	{
		assertTrue(equals(new int[] { 1 }, _tri.line(1)));
		assertTrue(equals(new int[] { 1, 1 }, _tri.line(2)));
		assertTrue(equals(new int[] { 1, 2, 1 }, _tri.line(3)));
		assertTrue(equals(new int[] { 1, 3, 3, 1 }, _tri.line(4)));
		assertTrue(equals(new int[] { 1, 4, 6, 4, 1 }, _tri.line(5)));
		assertTrue(equals(new int[] { 1, 5, 10, 10, 5, 1 }, _tri.line(6)));
		assertTrue(equals(new int[] { 1, 6, 15, 20, 15, 6, 1 }, _tri.line(7)));
		assertTrue(
		        equals(new int[] { 1, 7, 21, 35, 35, 21, 7, 1 }, _tri.line(8)));
		assertTrue(equals(new int[] { 1, 8, 28, 56, 70, 56, 28, 8, 1 },
		        _tri.line(9)));
		assertTrue(equals(new int[] { 1, 9, 36, 84, 126, 126, 84, 36, 9, 1 },
		        _tri.line(10)));

		assertTrue(equals(
		        new int[] { 1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1 },
		        _tri.line(11)));
		assertTrue(equals(new int[] { 1, 11, 55, 165, 330, 462, 462, 330, 165,
		        55, 11, 1 }, _tri.line(12)));
		assertTrue(equals(new int[] { 1, 12, 66, 220, 495, 792, 924, 792, 495,
		        220, 66, 12, 1 }, _tri.line(13)));

	}

	private boolean equals(int[] a, int[] b)
	{
		if (a.length != b.length)
		{
			System.err
			        .println(Arrays.toString(a) + " != " + Arrays.toString(b));
			return false;
		}

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i])
			{
				System.err.println(
				        Arrays.toString(a) + " != " + Arrays.toString(b));
				return false;
			}
		}
		return true;
	}

}
