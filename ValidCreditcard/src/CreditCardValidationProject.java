import java.util.Scanner;


public class CreditCardValidationProject
	{

		public static void main(String[] args)
			{
				long myCard [] = new long [16];
				long myCard1 [] = new long [16];
				Scanner user1nput = new Scanner(System.in);
				System.out.println("Please insert 16 numbers and see some magic.");
				long card = user1nput.nextLong();
				long dbob = 0;
				long bob = card % 10;
				for(int i = 0; i <= 15; i++)
					{
						if(i % 2 == 0)
							{
								myCard1[i] = bob;
								dbob = bob * 2;
								if(myCard[i] > 10)
									{
										dbob = dbob % 10;
										myCard[i] = dbob;
										dbob = dbob / 10;
										dbob = bob + dbob;
									}
							}
						else
							{
								dbob = card % 10;
								myCard[i] = bob;
								System.out.print(myCard[i]);
							}
						System.out.print(myCard1[i] + myCard[i]);
					}
			}
	}