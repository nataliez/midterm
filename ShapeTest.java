package shape;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


class ShapeTest {
	
	//Rectangle Tests
	@Test 
	void constructionTest1() {
		Rectangle rect1 = new Rectangle(3,4);
		assertTrue(rect1 instanceof Rectangle);
	}
	
	@Test
	void getiLengthTest1() {
		Rectangle rect2 = new Rectangle(6,6);
		//System.out.println(rect2.getiLength());
	}
	
	@Test
	void getiWidthTest1() {
		Rectangle rect2 = new Rectangle(7,8);
		//System.out.println(rect2.getiWidth());
	}

	@Test
	void areaTest1() {
		Rectangle rect3 = new Rectangle(2,2);
		assertTrue(rect3.area(2, 2) == 4);
	}
	
	@Test
	void perimeterTest1() {
		Rectangle rect4 = new Rectangle(2,6);
		assertTrue(rect4.perimeter(2, 6) == 16);
	}
	
	@Test
	 void compareTotest() {
		Rectangle rect1 = new Rectangle(2,2);
		Rectangle rect2 = new Rectangle(4,6);
		Rectangle[] comp = {rect1, rect2};
		Rectangle[] comp2 = Rectangle.compareTo(rect1, rect2);
		equals(comp == comp2);
		}
		 
	

	//Cuboid Tests
	@Test 
	void constructionTest2() {
		Cuboid c5 = new Cuboid(1,3,4);
		assertTrue(c5 instanceof Rectangle);
	}
	
	@Test
	void getilengthTest2() {
		Cuboid c2 = new Cuboid(5,6,7);
		assertEquals(c2.getiLength(), 5);
	}
	
	@Test
	void getiwidthTest2() {
		Cuboid c2 = new Cuboid(5,6,7);
		assertEquals(c2.getiWidth(), 6);
	}
	
	@Test
	void getiDepthTest2() {
		Cuboid c2 = new Cuboid(5,6,7);
		assertEquals(c2.getiDepth(), 7);
	}
	
	@Test
	void areaTest2() {
		Cuboid c2 = new Cuboid(2,3,4);
		assertTrue(c2.area(2, 3, 4) == 52);
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test 
	void shouldThrowException() {      
		Cuboid c1 = new Cuboid(5,6,7);
		Cuboid c2 = new Cuboid(2,3,4);
		thrown.expect(UnsupportedOperationException);
		thrown.expectMessage("Perimeter is not valid in this context");
		Cuboid.perimeter(c1, c2).throwsRuntime();
	}
	
	@Test
	void sortByVolumeTest1() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid (9,9,9);
		Cuboid[] comp = SortByVolume.compareTo(c1,c2);
		Cuboid[] comp2 = {c1, c2};
		Cuboid[] other = SortByVolume.compareTo(c2, c1);
		Cuboid[] other2 = {c2, c1};
		equals(comp == comp2);
		equals(other == other2);
	}
	
	@Test
	void sortByAreaTest1() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid (9,9,9);
		Cuboid[] comp = SortByArea.compareTo(c1,c2);
		Cuboid[] comp2 = {c1, c2};
		Cuboid[] other = SortByArea.compareTo(c2, c1);
		Cuboid[] other2 = {c2, c1};
		equals(comp == comp2);
		equals(other == other2);
	}
}



