package behaviors;
import lejos.robotics.subsumption.Behavior;
//import lejos.util.Delay;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;
/**
 * This program is to sense the cup using a light value of less than 40
 * @author	Sheila Noriega
 * Due June 15th 2017
 */

public class SenseCup implements Behavior {
	UltrasonicSensor ultra;
	LightSensor light;
	

	public SenseCup(UltrasonicSensor us, LightSensor ls){
		this.ultra = us;
		this.light = ls;
	}
	
	private boolean suppressed = false;

	@Override
	public boolean takeControl() {

		if (ultra.getDistance() < 15){
			return true;
		}

		return false; 
	}
/**
 * This method suppress sends to the next behavior unless it is true, then sends to the action. 
 * The action here is getting the light value of the object and stop. 
 */
	
	@Override
	public void suppress() {
		suppressed = true; 
	}

	@Override
	public void action () {
		suppressed = false;
		Motor.A.stop();
		Motor.C.stop();
		
		Motor.B.rotate(-90);
		Motor.B.rotate(90);
	
		
//		while(!(light.getLightValue() < 40)){
//			Motor.A.forward();
//			Motor.C.forward();
//			
//		}

		
		
		}
	

}
