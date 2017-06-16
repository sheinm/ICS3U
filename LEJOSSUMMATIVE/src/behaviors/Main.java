  package behaviors;

  import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
  
/**
 * This program is the declaration of behaviors and arbitrator
 * @author	Sheila Noriega
 * Due June 15th 2017
 */ 
public class Main {
	
public static void main(String[] args) {	
	
	UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S1);
	LightSensor light = new LightSensor(SensorPort.S2);
	TouchSensor touch = new TouchSensor (SensorPort.S4);
	
	Behavior b1 = new RunForward();
	Behavior b2 = new SenseCup(ultra, light);
	Behavior b3 = new HitObject (touch);
	Behavior b4 = new endProgram();
	Behavior [] behaviors = {b1, b2, b4};
	Arbitrator arby = new Arbitrator (behaviors);
	Button.waitForAnyPress();
	arby.start();
	
}

}
