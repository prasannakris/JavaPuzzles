package JavaPuzzles;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class PallnDromeTest {

	@Test
	public void isPalindromeString_NegativeTest() {
		Assert.assertFalse(JavaPuzzles.PallinDrome.isPalindromeString("test"));
	}
	
	

}
