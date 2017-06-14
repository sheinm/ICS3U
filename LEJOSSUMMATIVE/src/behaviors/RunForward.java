package behaviors;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.nxt.Button; 
public class RunForward implements Behavior {

	private boolean suppressed = false;

	public boolean takeControl() {
		return true;
	}

	public void suppress() {
		suppressed = true;
	}

	public void action (){
		suppressed = false;
		Motor.A.forward ();
		Motor.A.setSpeed(600);
		Motor.C.forward ();
		Motor.C.setSpeed(600);
		
		while (!suppressed)
			Thread.yield();
		Motor.A.stop();
		Motor.C.stop(); 

}
}
