package behaviors;
import lejos.robotics.subsumption.Behavior;
//import lejos.util.Delay;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;

public class SenseCup implements Behavior {
	UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S2);
	LightSensor light = new LightSensor(SensorPort.S1);
	

	private boolean suppressed = false;
	int distance; 
	@Override
	public boolean takeControl() {
		distance = ultra.getDistance();
		if (distance > 30){
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
		suppressed = false;
		Motor.A.stop();
		Motor.C.stop();
		
		while(!(light.getLightValue() > 40) && !suppressed){
			Motor.A.forward();
			Motor.C.forward();
			Thread.yield();
		}
		Motor.A.stop();
		Motor.C.stop();

	

		
		
		}
	

}
