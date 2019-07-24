package io.github.mrbrompton.HelloWorld.GUI;

import javafx.scene.control.Label;

public class ButtonPress {
	/**
	 * When button is pressed, consolePrint displays input string in console.
	 * @param string to print 
	 * @return true (method completed)
	 */
	public static boolean consolePrint(String string) {
		// TODO Auto-generated method stub
		boolean done = false;
		System.out.println(string);
		done = true;
		return done;
	}

	public static boolean windowPrint(String string) {
		// TODO Auto-generated method stub
		boolean done = false;
		Label label = new Label(string);
		HelloWorld.layout.getChildren().add(label );
		done = true;
		return done;
	}
}
