package selectionprgm;
import java.util.Scanner;
public class ATM 
{
	public static void main(String[] args) 
	{		
		Scanner ref=new Scanner(System.in);
		int correctpin=2736;
		int balance=2000;
		System.out.println("Enter Your Pin!!");
		int pin=ref.nextInt();
		if(pin==correctpin)
		{
			System.out.println("Enter The Amount!? ");
			int withdraamount=ref.nextInt();			
			if(withdraamount>=balance)
			{
				System.out.println("Withdrawn Succesfully!");
			}
			else 
			{
				 System.out.println("Insufficient!");	         
			}
		}
		else
		{
			System.out.println("Invalid Pin Number!");
		}
		ref.close();
	}
}
