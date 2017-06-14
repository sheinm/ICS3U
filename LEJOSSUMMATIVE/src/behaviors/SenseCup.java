package behaviors;

import lejos.robotics.subsumption.Behavior;
import lejos.nxt.SensorPort;
import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;

public class SenseCup implements Behavior {
	UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S2);

	private boolean suppressed = false;
	int distance; 
	@Override
	public boolean takeControl() {
		distance = ultra.getDistance();
		if (distance > 22){
			return true;
		}

		return false; 
	}

	@Override
	public void suppress() {
		suppressed = true; 
	}

	@Override
	public void action () {

		
		Motor.B.forward();
		Motor.B.setSpeed(800);
		}
	

}
