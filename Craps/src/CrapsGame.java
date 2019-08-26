import java.util.Scanner;

public class CrapsGame
	{
		static String myName;

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				Scanner userInputInt = new Scanner(System.in);
				System.out.println("hi what's your name");
				myName = userInputInt.nextLine();
				System.out.println("Hello " + myName);

				int rollNumber1 = (int) (Math.random() * 6) + 1;

				int rollNumber2 = (int) (Math.random() * 6) + 1;
				boolean stillPlaying = true;
				int totalDice = rollNumber1 + rollNumber2;
				int totalDice1 = totalDice + rollNumber1 + rollNumber2;
					{
						System.out.println("so you have rolled a " + rollNumber1 + " and also a " + rollNumber2
								+ " this equals " + totalDice + myName);

						if (totalDice == 7 || totalDice == 11)
							{
								System.out.println("congrats " + myName + " you win!");
								
							} else if (totalDice == 2 || totalDice == 12)
							{
								System.out.println(" unfortunately " + myName + " you lose");
								
							} else
							stillPlaying = false;

					}while (stillPlaying == true)
						{
							if (totalDice != 2 || totalDice != 12 || totalDice != 7 || totalDice != 11)
								{
									System.out.println(" you rolled a " + totalDice + "roll again ");
									System.out.println(rollNumber1);
								} else if (totalDice1  == 7 || totalDice1  == 11)
								{
									System.out.println(" well " + myName + "you did it on the second roll congrats.");
									stillPlaying = false;
								} else if (totalDice + totalDice == 2 || totalDice + totalDice == 12)
								{stillPlaying = false;
									System.out.println("you lose " + myName + "even after getting a second chance");
								} else
								{
									stillPlaying = false;
								}

						}
				
			}

	}