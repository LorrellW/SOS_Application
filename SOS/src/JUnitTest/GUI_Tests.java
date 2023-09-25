package JUnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sprint0.mainWindow;

class GUI_Tests {
	private mainWindow mainW;

	@BeforeEach
	public void setUp() {
		mainW = new mainWindow();
		mainW.setVisible(false);
	}

	@Test
	void testMainWindowCreation() {
		Assertions.assertNotNull(mainW);
		Assertions.assertFalse(mainW.isVisible());
	}

	@Test
	void testMainWindowTitle() {
		Assertions.assertNotNull(mainW.getTitle());
	}

	@Test
	void testMainWindowContentPane() {
		Assertions.assertNotNull(mainW.getContentPane());
	}

	@Test
	void testMainWindowSize() {
		Assertions.assertEquals(601, mainW.getWidth());
		Assertions.assertEquals(396, mainW.getHeight());
	}
}