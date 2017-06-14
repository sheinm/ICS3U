//final copy
package noriegaKrisnarajah;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

///import noriegaMestanzakrisnaraja.AdventureGame;
import hsa_new.Console;






/**
 * AdventureGame.Java
 * 
 * @author Sheila Noriega & Gayathiry Krisnarajah
 * (We are not the best programmers, but we tried our best.)
 * This is our game,"Your Lucky Day". The user will be informed that they have been entered into a draw where they have the chance
 * to win the prize of being able to travel to any continent and continue their own adventure. They will be faced with the strangest 
 * circumstances and have the luck of choosing their destiny. 
 * 
 */ 
public class GameProject
{


	public interface Console {
		

		public static void main(String[] args) throws InterruptedException
		{  


			Console console = new Console (500,500);

			boolean playAgain = false;
			int livesRemaining = 3; ///user has 3 lives, restarting the game each time they lose a life. After all lives are lost, the game is finished

			do {

				String userChoice = null;

				BufferedImage gamecover = null;
				try{
					gamecover = ImageIO.read(new File("PictureResources/gamecover.jpg"));
				}
				catch (IOException e){
					System.err.println("Error loading image");
					e.printStackTrace();
				}

				console.drawImage(gamecover, 300,0,100,100, null);

				console.setTextBackgroundColor(Color.black);			
				console.setTextColor(Color.white);



				console.println("Congrats, its your lucky day! You've won a contest that you don't remember entering! You now have the option of going to any 5 continents! Would you like to accept your prize?(Yes)");

				userChoice = console.readLine();// User has no choice but to accept the offer

				console.println("Thank you for accepting our offer!! We have planned an amazing trip for you! You have the luck of going to "
						+ getRandomContinent()+ " & all accomodations have already been prepared!!!" );

				if (getRandomContinent().equals("Africa")) // user will be going to Africa where they will be given several pathways to win the game
				{
					try {

						Clip theme = AudioSystem.getClip(); 
						theme.open(AudioSystem.getAudioInputStream(new File("MusicFile/Cool African Music - African Safari.wav"))); 
						theme.start();
						Thread.sleep(5000);
						theme.stop();

					}
					catch (Exception e) {
						e.printStackTrace();
					}

					console.println("Would you like to join a hunting party or go on an all inclusive safari tour?(Party/Safari)");
					userChoice = console.readLine();

					if (userChoice.equalsIgnoreCase("Party")) {

						BufferedImage huntingParty1 = null;

						try{
							huntingParty1 = ImageIO.read(new File("PictureResources/huntingParty.jpg"));
						}catch (IOException e){
							System.err.println("Error loading image");
							e.printStackTrace();
						}
						console.drawImage(huntingParty1, 300,0,100,100, null);

						console.println("Quickly after adjusting to the heartless lifestyle, you begin to hunt an endangered rhinoceros species, earning the respect of the other hunters. ");
						console.println("One day, while taking a walk in the tall grass, you begin to question your life choices. You come across the crystal-clear conclusion that you've been using hunting as a way of filling the empty void in your heart. Would you like to pack up your stuff, leave and retain your place in western society??(Yes/No) ");
						userChoice = console.readLine();

						if (userChoice.equalsIgnoreCase("Yes")) {


							console.println("With a smile on your face and a bounce in your step, you begin walking back to hand in your resignation, but you stumble into a ditch and hit your head on the cold earthen floor. When you wake up, you find yourself in a tunnel. Being the adventerous person you are, you want to follow the tunnel, but you're not sure.");

							BufferedImage tunnelHunting = null;
							try{
								tunnelHunting = ImageIO.read(new File("PictureResources/tunnelHunting.jpg"));
							}catch (IOException e) {
								System.err.println("Error loading image.");
								e.printStackTrace();
							}
							console.drawImage (tunnelHunting, 300, 0, 100, 100, null);

							console.println("So, will you follow the tunnel?(Yes/No)");

							userChoice = console.readLine();

							if (userChoice.equalsIgnoreCase("Yes")) {

								BufferedImage safariTemple = null;
								try{
									safariTemple = ImageIO.read(new File("PictureResources/safariTemple.jpg"));
								}catch (IOException e){
									System.err.println("Error loading image");
									e.printStackTrace();
								}

								console.drawImage (safariTemple, 300, 0, 100, 100, null);

								console.println("After walking several undergound killometers, you enter a cave and are astonished to find a gold covered temple! Suddenly, animals start crowding around you, and just like in any movie, you are crowned king of the jungle!");

								try {
									Clip theme2 = AudioSystem.getClip(); 
									theme2.open(AudioSystem.getAudioInputStream(new File("Musicfile/Celebration Sound Effect.wav"))); 
									theme2.start();
									Thread.sleep(500);

									console.println("Congrats, you've succeeded in life.");

									BufferedImage winner = null;
									try{
										winner =ImageIO.read(new File("PictureResources/winner.jpg"));
									}catch (IOException e) {
										System.err.println("Error loading image.");
										e.printStackTrace();
									}
									console.drawImage (winner, 400, 0, 100, 100, null);

									theme2.stop();									
									Thread.sleep(1000);

								} catch (Exception e) {
									e.printStackTrace();
								}	

								console.readLine();
								console.close();

							} else if (userChoice.equalsIgnoreCase("No")) {
								console.println("Knowing how terrible your sense of direction is, you refuse to go forward. You begin struggling to find a way out, and begin to panic. Suddenly, you hear a rumble and the tunnel collapses within itself.");

								try {
									Clip theme4 = AudioSystem.getClip(); 
									theme4.open(AudioSystem.getAudioInputStream(new File("Musicfile/Avalanche Rockslide Sounds"))); //open the given file for the clip
									Thread.sleep(1000);
									theme4.start();
									Thread.sleep(1000);
									theme4.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}

								console.println("With a hole opening up in your stomach, you have no choice but to close your eyes and hope its a dream.");

								livesRemaining = livesRemaining - 1;

								if (livesRemaining > 0) {
									playAgain = true;

									console.println("Sorry, you made some bad choices, thought you had better instincts than that. You can play again, but try to make better choices from now on!");

									BufferedImage gameover = null;

									try{
										gameover  = ImageIO.read(new File("PictureResouces/gameover.gif"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage (gameover, 300, 0, 100, 100, null);

									break;

								} else {
									playAgain = false;
									console.println("Sorry, too many bad choices commonly correlates with death. Game Over.");

									BufferedImage gameover = null;
									try{
										gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage (gameover, 300, 0, 100, 100, null);					
									console.readLine();
									console.clear();
									break;
								}



							} else if (userChoice.equalsIgnoreCase("Safari")) {

								BufferedImage safariChoice = null;
								try{
									safariChoice = ImageIO.read(new File("PictureResources/safariChoice.jpg"));
								}catch (IOException e){
									System.err.println("Error loading image");
									e.printStackTrace();
								}
								console.drawImage (safariChoice, 300, 0, 100, 100, null);

								console.println("You've chosen to go on a world famous safari tour! While exploring the great savannah, you spot a mysterious prescence in the tall grass. Would you like to follow it?(Yes/No");

								if (userChoice.equals("Yes")) {
									console.println("As you approach the shape, you realize it is a tribe member! You decide to follow them even further, and you discover a grand village.Do you decide to join or go back to your tour group? (Stay/Go Back)");

									if (userChoice.equals("No")) {

										BufferedImage richesPile = null;
										try{
											richesPile = ImageIO.read(new File("PictureResources/richesPile.jpg"));
										}catch (IOException e){
											System.err.println("Error loading image");
											e.printStackTrace();
										}

										console.drawImage (richesPile, 300, 0, 100, 100, null);


										console.println("You've spotted a mountain of riches behind a hut! You gather everything in your arms and begin to run as fast as you can back! While running back, you hear a pack of lions behind you. Everything turns black.");

										try {

											Clip theme10 = AudioSystem.getClip(); 
											theme10.open(AudioSystem.getAudioInputStream(new File("Musicfile/finalPantherEffect.wav"))); 
											Thread.sleep(1000);
											theme10.start();
											Thread.sleep(500);
											theme10.stop();									
											Thread.sleep(1000);

										} catch (Exception e) {
											e.printStackTrace();
										}

										livesRemaining = livesRemaining - 1;

										if (livesRemaining > 0) {
											playAgain = true;
											console.println("Sorry, you made some bad choices. You can play again, but try to make better choices!");
											BufferedImage gameover = null;

											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											break;
										} else {
											playAgain = false;
											console.println("Sorry,you made some bad choices! Game over!");

											BufferedImage gameover =  null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);

											console.readLine();
											console.clear();

											break;
										}

									} else if (userChoice.equalsIgnoreCase("Stay")) {

										console.println("You introduce yourself to everyone, and they welcome you with open arms.After partying all night, you've shown the leaders your potential.");
										try {

											Clip theme11 = AudioSystem.getClip();
											theme11.open(AudioSystem.getAudioInputStream(new File("Musicfile/Celebration Sound Effect.wav")));
											Thread.sleep(1000);
											theme11.start();

											console.println("The very next morning you wake up to find that you are part of the super council and have been elected chairman of foregin affairs. Congrats, you have succeeded in life.");

											theme11.stop();									
											Thread.sleep(1000);
										} catch (Exception e) {
											e.printStackTrace();
										}
										console.readLine();
										console.close();
									}
								} 

							}
						}

						if (getRandomContinent().equalsIgnoreCase("South America")) {
							try {
								Clip theme21 = AudioSystem.getClip();
								theme21.open(AudioSystem.getAudioInputStream(new File("Musicfile/Tropical Island Music.wav"))); //open the given file for the clip
								Thread.sleep(1000);
								theme21.start();


								BufferedImage southAmerica = null;								
								try{
									southAmerica = ImageIO.read(new File("Musicfile/southAmerica.jpg"));
								}catch (IOException e){
									System.err.println("Error loading image");
									e.printStackTrace();
								}
								console.drawImage(southAmerica, 300,0,100,100, null);

								console.println("You remember that you have family in South America and you choose to take an all-inclusive 5 star cruise ship.");								
								console.println("You are enjoying the luxiourious trip when you hear a crash and chaos ensues. When you come back to your senses, you realize the boat has hit a random island.");							

								BufferedImage southCruise = null;
								try{
									southCruise = ImageIO.read(new File("PictureResources/southCruise.jpg"));
								}catch (IOException e){
									System.err.println("Error loading image");
									e.printStackTrace();
								}
								console.drawImage (southCruise, 300, 0, 100, 100, null);

								theme21.stop();

								try {


									Clip theme14 = AudioSystem.getClip(); 
									theme14.open(AudioSystem.getAudioInputStream(new File("Musicfile/Jungle Music - Amazon Princess.wav"))); //open the given file for the clip
									Thread.sleep(1000);									
									theme14.loop(Clip.LOOP_CONTINUOUSLY);
									Thread.sleep(5000);
									theme14.stop();
								}

								catch (Exception e) {
									e.printStackTrace();
								}


								console.println("You get off the boat and start walking inland. You start following the loud music and the smell of fire and you stumble upon a campthat there are camps and people are actually living on this land. Do you decide to adapt to the native lifestyle on the island and hopefully find riches, or do you wait for a rescue hospital? (Stay/Rescue)");

								BufferedImage  tribeVillage = null;

								try{
									tribeVillage = ImageIO.read(new File("PictureResources/tribeVillage.jpg"));
								}catch (IOException e){
									System.err.println("Error loading image");
									e.printStackTrace();
								}
								console.drawImage (tribeVillage, 300, 0, 100, 100, null);

								userChoice = console.readLine();
								if (userChoice.equalsIgnoreCase("Stay")) {
									console.println("You begin to adapt to the lifestyle of the natives. You realize that you enjoy the calm island lifestyle rather than the city-jungle life full of preservatives.");
									console.println("One day, you are wandering around the island looking for fresh mangoes,and stumble across an eerie tent. Having learnt your lesson on taking risks, you enter and stare at the plain box in the middle. Do you open it? (Yes/No)");


									userChoice = console.readLine();

									if (userChoice.equalsIgnoreCase("Yes")) {
										console.println("You open the dusty box and find a map containing a secret script. Although you don't understand the script, you see familiar landmarks and decide to follow the arrows. After following the path, you uncover a secret waterfall. Behind it, there is the golden city. You have won in life.");
										console.println("Congrats.");
										console.close();
									} else {
										console.println("You have decided to leave the empty box on the ground. Sadly, you will never know what was in it.");
										console.println("Knowing its time to go home, you turn back only to find a black panther staring at you. Everything goes dark.");

										try {

											Clip theme10 = AudioSystem.getClip(); 
											theme10.open(AudioSystem.getAudioInputStream(new File("Musicfile/finalPantherEffect.wav"))); //opens music file to play until interupted 
											Thread.sleep(1000);
											theme10.start();
											Thread.sleep(500);
											theme10.stop();									
											Thread.sleep(1000);

										} catch (Exception e) {
											e.printStackTrace();
										}


										livesRemaining = livesRemaining - 1;
										//subtracts lives if there are remaining lives

										if (livesRemaining > 0) {
											//reloops to the beginning
											playAgain = true;
											console.println("Sorry, you made some bad choices. You can play again, but try to make better choices!");
											BufferedImage gameover =null;
											try{
												gameover  = ImageIO.read(new File("gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											break;
										} else {
											//ends game
											playAgain = false;
											BufferedImage gameover =null;
											try{
												gameover  = ImageIO.read(new File("gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											console.println("Sorry, sometimes bad choices can lead to only one road, death. Try to make smarter choices next time.");
											break;
										}
									}
								} else if (userChoice.equalsIgnoreCase("Rescue")) 
								{
									BufferedImage helicopter = null;
									try{
										helicopter = ImageIO.read(new File("PictureResources/helicopter.jpg"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage (helicopter, 400, 0, 100, 100, null);

									console.println("You decide to take the rescue helicopter rather than risk dying in the wild away from your WiFi.");
									console.println("Luckily for you, the rescue helicopter arrives quickly. Unluckily for you, an unexpected storm appears. All you remember is the helicopter spinning before you black out.");

									livesRemaining = livesRemaining - 1;

									if (livesRemaining > 0) {
										playAgain = true;
										console.println("Sorry, maybe you should've taken a risk and lived a little more. You can play again, but try to make better choices!");
										BufferedImage gameover =null;
										try{
											gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
										}catch (IOException e){
											System.err.println("Error loading image");
											e.printStackTrace();
										}
										console.drawImage (gameover, 400, 0, 100, 100, null);
										break;
									} else {
										playAgain = false;
										console.println("Sorry, you made some bad choices. You're dead now.");
										BufferedImage gameover =null;
										try{
											gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
										}catch (IOException e){
											System.err.println("Error loading image");
											e.printStackTrace();
										}
										console.drawImage (gameover, 400, 0, 100, 100, null);
										console.readLine();
										console.clear();
										break;
									}

								} 	else if (getRandomContinent().equals("Australia"))
									// the continent the user will be going to is Australia
								{
									BufferedImage australia1 = null;
									try{
										australia1 = ImageIO.read(new File("PictureResources/australia.jpg"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage (australia1, 300, 0, 100, 100, null);

									console.println("You've chosen to visit the wonderful city of Sydney and fulfill your dream of visiting the Blue Mountains National Park and making life-long friendships with both koalas and surfers.");	

									BufferedImage australiaWallaby = null;
									try{
										australiaWallaby = ImageIO.read(new File("PictureResources/australiaWallaby.jpg"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage (australiaWallaby, 300, 0, 100, 100, null);

									console.println("Everything seems normal as you board your plane, the stewardess is very kind and you feel at ease. After drinking an apple juice, you begin to feel very sleepy..");
									console.println("When you wake up you feel a pounding in your head and hear the empty nothingness. Looking down, you see you're in a space suit. Turning your head, you see space! You've been scammed!");
									console.println("You look around the empty box-like structure, panicking, and you begin to feel a pull to a specific corner. Squinting your eyes, you notice theres a faint light illuminating from that corner.");
									console.println("You start walking to the corner but your phone suddenly begins to ring. You hesitanly answer it and a dark, ominous voice is on the other side. ");

									BufferedImage sketchyPhone = null;
									try{
										sketchyPhone = ImageIO.read(new File("PictureResources/sketchyPhone.jpg"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage (sketchyPhone, 200, 0, 100, 100, null);
									console.println("They ask you if you would prefer to go home or continue on your journey. What do you respond?(Go Home/Continue)");

									userChoice = console.readLine();

									if (userChoice.equalsIgnoreCase("Continue")) {
										console.println("You take your chance and choose to continue.");
										console.println("A maniac laughter begins in the background, and you feel your heart drop.");
										console.println("You begin to black out, and fall onto the ground. When you wake up, you're in a field. Then you hear it...");

										try {

											Clip theme10 = AudioSystem.getClip(); 
											theme10.open(AudioSystem.getAudioInputStream(new File("finalPantherEffect.wav"))); //open the given file for the clip
											Thread.sleep(1000);
											theme10.start();
											Thread.sleep(500);
											theme10.stop();									
											Thread.sleep(1000);

										} catch (Exception e) {
											e.printStackTrace();
										}

										if (livesRemaining > 0) {
											playAgain = true;
											console.println("Sometimes choices don't have the consequences we were expecting, if we remember them at all. Think about it when you play again, you have a new chance!");
											BufferedImage gameover = null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											break;
										} else {
											playAgain = false;
											BufferedImage gameover = null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											console.println("Hmmm, maybe you weren't as lucky as we thought you were. Better luck next time, pal.");
											console.readLine();
											console.clear();
											break;
										}

									}
									else if (userChoice.equals("Go Home")) 
									{
										console.println("You've chosen to go home back to your mediocre life, back to your everyday breakfast, back to your bed. It all sounds nice, but are you really taking that chance?");

										livesRemaining = livesRemaining - 1;

										if (livesRemaining > 0) {
											playAgain = true;
											console.println("The voice explains to you that there is only a 50% chance of survival. You know you can't turn back, you miss your bed too much. Nodding your head at no one in particular, you agree. ");
											console.println("Yikes, what happened. Nothing, nothing happened. You are now stuck in space. Sorry, there must've been a mix up in your travel plans ");
											console.println("Hope your insurance plan covers this little mishap. Better luck next time, kiddo.");

											BufferedImage gameover = null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											break;
										} else {
											playAgain = false;
											console.println ("The End. Game over. Another Dissapointment.");
											BufferedImage gameover = null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											console.readLine();
											console.clear();
											break;
										}

									}

								} else if (getRandomContinent().equals("Antartica"))
								{

									console.println("You've agreed to go to Antartica and accomplish your life long dream of meeting the penguins!! Or possibly discover a secret ice kingdom and take care of all the penguins forever.");

									BufferedImage antartica1 = null;
									try {
										antartica1 = ImageIO.read(new File("PictureResources/antartica.jpg"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage(antartica1, 300, 0, 100, 100, null);

									console.println("In the middle of an expedition on the second day, you lose track of time and end up alone in a sea of penguins.");
									BufferedImage penguins = null;
									try{
										penguins = ImageIO.read(new File("PictureResources/penguins.jpg"));
									}catch (IOException e){
										System.err.println("Error loading image");
										e.printStackTrace();
									}
									console.drawImage(penguins,300,0,100,100,null);

									DataLine theme;
									try {
										Clip windEffect = AudioSystem.getClip(); 
										windEffect.open(AudioSystem.getAudioInputStream(new File("Musicfile/Wind sound effect(2).wav"))); //open the given file for the clip
										Thread.sleep(1000);
										theme.start();
										Thread.sleep(1000);
									} catch (Exception e) {
										e.printStackTrace();
									}

									console.println("You begin walking in the direction which you think you came from. You keep walking, walking, walking.");
									console.println("Tired of iceberds and glaciers, you rejoice when you stumble across a single igloo!! Do you enter or continue?(Enter/Continue");
									userChoice =console.readLine();

									if (userChoice.contentEquals("Continue"))
									{
										console.println("You're determined to find a real human, and choose to keep walking.");
										console.println("You feel something tug at your heart, knowing you don't have much time left. Your feet begin to tremble and your arms begin to shake. Can you continue?");
										Thread.sleep(5000);
										Thread.sleep(500);
										theme.stop();								

										console.println("You know you have to! Before you know it, you're at the edge of the ocean! With the sun about to set, you signal a passing ship; screaming from the top of your lungs");
										console.println("You're safe now! You can go back home and finish your program even though you don't know how to program and you need constant help.");
										try {

											Clip theme1 = AudioSystem.getClip(); 
											theme1.open(AudioSystem.getAudioInputStream(new File("Celebration Sound Effect.wav"))); //open the given file for the clip;
											theme1.start();
											Thread.sleep(5000);
											theme.stop();
											Thread.sleep(1000);
										} catch (Exception e) {
											e.printStackTrace();
										}
										console.readLine();
										console.close();


									}

									else if (userChoice.equalsIgnoreCase("Enter"))
									{
										console.println("You've admitted defeat. You tell yourself its the logical decision to make, you need to rest...");

										try {
											Clip theme1 = AudioSystem.getClip(); 
											theme1.open(AudioSystem.getAudioInputStream(new File("Musicfile/Quiet Slumber - Creepy Music Box.wav"))); 
											Thread.sleep(1000);
											theme1.start();

											console.println("Inside you find a blanket in the middle of the floor and a small fireplace. Sadly, you're too cold to realize the matches on the other side of the igloo :(");
											console.println("Violent shivers begin to wrack your body as you struggle to breathe, and you opt to wrap yourself in your blanket.");
											console.println("You begin rocking back and forth, wishing you never took the offer in the first place. Shaking your head, you begin to close your eyes,not realizing you might not be able to open them ever again.");

											Thread.sleep(5000);
											theme1.stop();
											Thread.sleep(1000);
										} catch (Exception e) {
											e.printStackTrace();
										}

										if (livesRemaining > 0)
										{
											playAgain = true;
											console.println("Sorry, something strange just happened. Let's just restart and pretend it was all a dream...");
											BufferedImage gameover = null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											break;
										} else {
											playAgain = false;
											BufferedImage gameover = null;
											try{
												gameover  = ImageIO.read(new File("PictureResources/gameover.gif"));
											}catch (IOException e){
												System.err.println("Error loading image");
												e.printStackTrace();
											}
											console.drawImage (gameover, 400, 0, 100, 100, null);
											console.println("Well, that was a crazy dream. Or maybe it was the consequences of really bad choices. Maybe this is all a really bad dream, and reality is just...");
											console.println("Doesn't matter, game over. Better luck next time.");
											console.readLine();
											console.clear();
											break;
										}
									}


								}




							}



						}

					} 
				}

			}while (playAgain);
		}



	}



	public static String getRandomContinent() {
		String[] continents = { "Africa", "South America", "Australia", "Antartica" };			
		int randomContinent = (int)(Math.random() * continents.length);
		return continents[randomContinent];

	}


}








