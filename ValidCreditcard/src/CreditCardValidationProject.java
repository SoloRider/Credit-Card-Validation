import java.util.Scanner;


public class CreditCardValidationProject
	{

		public static void main(String[] args)
			{
				int myCard [] = new int [16];
				Scanner user1nput = new Scanner(System.in);
				System.out.println("Please insert 16 numbers and see some magic in the form of a credit.");
				int card = user1nput.nextInt();
				for(int i = 0; i < 16; i++)
					{
						myCard[i] = card;
					}
				
			}
	}
