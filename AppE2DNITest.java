package n1e1to3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AppE2DNITest {

	@ParameterizedTest
	@ValueSource(ints = {12345678, 24341234, 36765432, 49344321, 62456123, 74423615, 85651237, 89859632, 93987541, 95154789})
	//@ValueSource(strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}) 	//able to use various parameters?
	void codeReturnedShouldBeA(int number) {
		var codeID = new CalculateID();
		assertEquals("A", codeID.calculateID(number));
	}

}
