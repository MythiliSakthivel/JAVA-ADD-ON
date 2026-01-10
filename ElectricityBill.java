package selectionprgm;
import java.util.*;
public class ElectricityBill 
{
	public static void CalculateBill(int units)
	{
		int Bill=units*7;
		System.out.println("Your this month tt Bill:"+Bill);	
	}
	public static void main(String[] args) 
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the Units:");
		int units=ref.nextInt();
		CalculateBill(units);
	}
}
