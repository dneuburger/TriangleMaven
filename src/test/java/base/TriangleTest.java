package base;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TriangleTest extends Triangle{
	protected double s1, s2, s3;
	@Test
	public void test() {
		Triangle test = new Triangle(3,4,5);
		double result = test.getPerimeter();
		assertEquals(12, result, 0);
		result = test.getArea();
		assertEquals(6.0, result, 0.001);
		//toString
	}

}
