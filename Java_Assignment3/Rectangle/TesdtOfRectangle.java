/*This class is use to run All the tests files of rectangle
*/



package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({TestForAreaOfRectangle.class,TestForPerimeterOfRectangle.class,
	TestToCheckTwoRectangleObjectsBehaviours.class,
	TestToCheckTwoRectangleObjectsDiagonal.class,
	TestToCheckTwoRectangleObjectsPeremeterTestTest.class})

public class TesdtOfRectangle {

	@Test
	public void test() {


	}

}
 