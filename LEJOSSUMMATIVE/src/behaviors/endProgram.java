package behaviors;

import lejos.robotics.subsumption.Behavior;
import lejos.nxt.Button;
import lejos.nxt.Motor; 

public class endProgram implements Behavior {

	@Override
	public boolean takeControl() {
		return Button.ESCAPE.isDown();
	}
	@Override
	public void action() {
		System.exit(0);
	}

	@Override
	/**
	 * This method suppress sends to the next behavior unless it is true, then sends to the action
	 * This will end the program when the button is pressed
	 */  
	public void suppress() {
	}

}





	


	

