package behaviors;
import lejos.nxt.TouchSensor; 

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class HitObject implements Behavior {
	
	TouchSensor touch;
	private boolean suppressed = false;

	public HitObject(TouchSensor ts){
		this.touch = ts;
	}
	
	public boolean takeControl() {
		if (touch.isPressed ()){
			return true;

		}
		return false;
	}
	
	/**
	 * This method suppress sends to the next behavior unless it is true, then sends to the action
	 */
	public void suppress() {
		suppressed = true;
	}

	public void action (){
		suppressed = false;
		Motor.B.rotate(100); 
		Motor.B.forward(); 
		Motor.B.setSpeed(725);
		Motor.A.backward();
		Motor.C.backward();
		Delay.msDelay(2000);
}

}
