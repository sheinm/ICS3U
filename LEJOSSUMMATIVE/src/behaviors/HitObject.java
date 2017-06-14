package behaviors;
import lejos.nxt.TouchSensor; 

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class HitObject implements Behavior {
	
	TouchSensor touch = new TouchSensor (SensorPort.S1);
	private boolean suppressed = false;

	public boolean takeControl() {
		if (touch.isPressed ()){
			return true;

		}
		return false;
	}

	public void suppress() {
		suppressed = true;
	}

	public void action (){
		suppressed = false;
		Motor.A.forward ();
		Motor.A.setSpeed (800);
		Motor.C.setSpeed(800);
		Motor.C.forward ();
		
		while (!suppressed)
			Thread.yield();
		Motor.A.stop();
		Motor.C.stop(); 

}

}
