package behaviors;

import lejos.robotics.subsumption.Behavior;
import lejos.nxt.Button;
import lejos.nxt.Motor; 

public class endProgram implements Behavior {

	@Override
	public boolean takeControl() {
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
	 
		Motor.A.stop();
		Motor.B.stop();
		System.exit(0);
	}

	@Override
	public void suppress() {
	}

}





	


	

