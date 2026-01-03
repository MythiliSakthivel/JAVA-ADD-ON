package selectionprgm;
import java.util.Scanner;
public class Calc 
{
	public static void main(String[] args)
	{
		Scanner ref=new Scanner(System.in);
		int choice;
		while(true) 
		{
			System.out.println("Enter Your Choice");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			choice=ref.nextInt();
			if(choice>=1 && choice<=4)
			{
				System.out.println("Enter The First Value?");
				int val1=ref.nextInt();
				System.out.println("Enter The Second Value?");
				int val2=ref.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("ADDITION: "+(val1+val2));
					break;
				case 2:
					System.out.println("SUBTRACTION: "+(val1-val2));
					break;
				case 3:
					System.out.println("MULTIPLICATION: "+(val1*val2));
					break;
				case 4:
					System.out.println("DIVISION: "+(val1/val2));
					break;
				}
			}
			else
			{
				System.out.println("Exited");
			}
		}
	}
}
