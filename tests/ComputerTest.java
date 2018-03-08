package tests;
import logic.*;
import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class ComputerTest {


	@Test
	public void testFunction() {
		Computer c = new Computer();
		assertNotNull("No shots", c.getShot());
		c.setShot(false);
		assertNotNull("Shots fired", c.getShot());

	}

	@Test
	public void test_missed_shot() {
		Computer c = new Computer();
		c.setShot(false);
		assertFalse("Computer knows that this shot missed",c.lastGood);
		assertEquals("Computer is firing 'weighted' shots", 0, c.shotType, 0.0001);
	}

	@Test
	public void easy_hit_NoPreviousHit() {
		Computer c = new Computer();
		c.setShot(true);
		assertTrue("Shot is properly registered as a correct hit", c.getGood());

	}

	@Test
	public void test_missed_middle_shot() {
		Computer c = new Computer();
		c.setShot(true);
		c.setShot(false);
		assertFalse("Missed shot will be recognized.", c.getGood());

	}

	@Test
	public void test_hitwithPreviousHits() {
		Computer c = new Computer();
		c.setShot(true);
		c.setShot(true);
		c.setShot(true);
		assertTrue ("Consecutive shots are remembered and recognized", c.getGood());
	}

	@Test
	public void test_checkingDirection() {
		Computer c = new Computer();
		c.setShot(false);
		c.setShot(true);
		int[] coord =c.getShot();
		int a = coord[1];
		int b = coord[0];
		c.setShot(true);
		coord = c.getShot();
		if (c.trueN) {
			b--;
		}
		else if (c.trueE) {
			a++;
		}
		else if (c.trueW) {
			a--;
		}
		else if (c.trueS) {
			b++;
		}
		assertEquals("Directional firing increments proper x direction", a, coord[1], 0.00001);
		assertEquals("Directional firing increments proper y direction", b, coord[0], 0.00001);
	}


}
