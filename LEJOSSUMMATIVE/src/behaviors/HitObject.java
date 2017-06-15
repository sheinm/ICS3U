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
		while (!suppressed )
			Motor.B.rotate(100);
			Motor.B.forward();
			Motor.B.setSpeed(725);
	
		Motor.A.backward();
		Motor.C.backward();
}

}
