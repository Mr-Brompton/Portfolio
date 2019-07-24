package io.github.mrbrompton.HelloWorld.app;

public class GreetingGenerator {

	public static String getGreeting() {
		/* 1
		 * Uses greeting constructor to create a greeting object.
		 */
		int randomA = (int) (Math.random()*10);
		int randomB = (int) (Math.random()*10);
		Greeting greeting = new Greeting(io.github.mrbrompton.HelloWorld.resource.Opening.iJustNeedAnOpening[randomA], io.github.mrbrompton.HelloWorld.resource.Nouns.giveMeANoun[randomB]);
		/*2
		 * call attribute from the greeting object to print the greeting.
		 * This section will call method from the greeting class to refresh the greeting.
		 * Then it will ask if you would like to run the program again
		 * if yes the greeting will be refreshed and we loop back to step two.
		 * if no program says farewell, closes and exits. 
		 */
	
		return greeting.sayHi;
	}

}
