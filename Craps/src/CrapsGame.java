import java.util.Scanner;

public class CrapsGame
	{
		static String myName;
static String myChoice;
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
// i edited this :);
				Scanner userInputInt = new Scanner(System.in);
				System.out.println("hi what's your name");
				myName = userInputInt.nextLine();
				System.out.println("Hello " + myName);
				
				int rollNumber1 = (int) (Math.random() * 6) + 1;

				int rollNumber2 = (int) (Math.random() * 6) + 1;
				int rollNumber3 = (int) (Math.random() * 3) + 1;
				int rollNumber4 = (int) (Math.random() * 3) + 1;
				int totalDice = rollNumber1 + rollNumber2;
				int totalDice1 = totalDice + rollNumber3 + rollNumber4;
				boolean stillPlaying = true;
			
					{
						System.out.println("so you have rolled a " + rollNumber1 + " and also a " + rollNumber2
								+ " this equals " + totalDice +  myName);

						if (totalDice == 7 || totalDice == 11)
							{
								System.out.println("congrats " + myName + " you win!");
								System.exit(0);
							} else if (totalDice == 2 || totalDice == 12)
							{
								System.out.println(" unfortunately " + myName + " you lose");
						System.exit(0);
							} else
							stillPlaying=false;
						
						Scanner userInput = new Scanner(System.in);
						System.out.println(" you rolled a " + totalDice + " roll again type OK to roll again");
						myChoice = userInput.nextLine();
					System.out.println(totalDice1);
						
						while (stillPlaying)
							
							{
								if ( myChoice == "ok" && totalDice1 != 2 || totalDice1 != 12 || totalDice1 != 7 || totalDice1 != 11)
									{
										System.out.println(" you rolled a " + totalDice + totalDice1);
										
									} 
								else if (myChoice == "ok " && totalDice1 == 7 || totalDice1 == 11)
									{
										System.out
												.println(" well " + myName + "you did it on the second roll congrats.");
										System.exit(0);
									} 
								else if (myChoice == "ok " && totalDice1 == 2 || totalDice1 == 12)
									{
										
										System.out.println("you lose " + myName + "even after getting a second chance");
									System.exit(0);
									} 
								else
									{
										System.out.println("you didn't win or lose here is another roll");
										stillPlaying = false;
									}

							}

					}
			}
	}
