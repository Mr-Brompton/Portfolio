package io.github.mrbrompton.HelloWorld.GUI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ButtonPressTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertTrue(ButtonPress.consolePrint("Testing Button"));
	}

}
