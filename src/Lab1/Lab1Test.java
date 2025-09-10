package Lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class Lab1Test {

	@Test
	void testMyID() {
		assertEquals(Lab.getMyID(), "221224662");
	}
	
	@Test
	void testMyLetterGrade() {
		assertEquals(Lab.getLetterGrade(100), "A+");
		assertEquals(Lab.getLetterGrade(95), "A+");
		assertEquals(Lab.getLetterGrade(90), "A+");
		assertEquals(Lab.getLetterGrade(85), "A");
		assertEquals(Lab.getLetterGrade(80), "A");
		assertEquals(Lab.getLetterGrade(75), "B+");
		assertEquals(Lab.getLetterGrade(70), "B");
		assertEquals(Lab.getLetterGrade(65), "C+");
		assertEquals(Lab.getLetterGrade(60), "C");
		assertEquals(Lab.getLetterGrade(55), "D+");
		assertEquals(Lab.getLetterGrade(50), "D");
		assertEquals(Lab.getLetterGrade(45), "E");
		assertEquals(Lab.getLetterGrade(40), "F");
		assertEquals(Lab.getLetterGrade(20), "F");
		assertEquals(Lab.getLetterGrade(0), "F");
	}
	
	@Test
	void testAddAndChangeScale() {
		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(90.0);
		list.add(95.0);
		list.add(100.0);
		
		assertEquals(9.50, Lab.addAndChangeScale(list));
		
		ArrayList<Double> list1 = new ArrayList<Double>();
		
		list1.add(92.5);
		list1.add(94.0);
		list1.add(100.0);
		list1.add(100.0);
		list1.add(90.0);
		
		assertEquals(9.53, Lab.addAndChangeScale(list1));
	}
}
