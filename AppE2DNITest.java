package n1e1to3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppE2DNITest {

	@Test
	void codeReturnedShouldBeA() {
		var codeID = new CalculateID();
		assertEquals("A", codeID.calculateID(12345678));
	}
	
	@Test
	void codeReturnedShouldBeB() {
		var codeID = new CalculateID();
		assertEquals("B", codeID.calculateID(24341234));
	}
	
	@Test
	void codeReturnedShouldBeC() {
		var codeID = new CalculateID();
		assertEquals("C", codeID.calculateID(36765432));
	}
	
	@Test
	void codeReturnedShouldBeD() {
		var codeID = new CalculateID();
		assertEquals("D", codeID.calculateID(49344321));
	}
	
	@Test
	void codeReturnedShouldBeE() {
		var codeID = new CalculateID();
		assertEquals("E", codeID.calculateID(62456123));
	}
	
	@Test
	void codeReturnedShouldBeF() {
		var codeID = new CalculateID();
		assertEquals("F", codeID.calculateID(74423615));
	}
	
	@Test
	void codeReturnedShouldBeG() {
		var codeID = new CalculateID();
		assertEquals("G", codeID.calculateID(85651237));
	}
	
	@Test
	void codeReturnedShouldBeH() {
		var codeID = new CalculateID();
		assertEquals("H", codeID.calculateID(89859632));
	}
	
	@Test
	void codeReturnedShouldBeI() {
		var codeID = new CalculateID();
		assertEquals("I", codeID.calculateID(93987541));
	}
	
	@Test
	void codeReturnedShouldBeJ() {
		var codeID = new CalculateID();
		assertEquals("J", codeID.calculateID(95154789));
	}

}
