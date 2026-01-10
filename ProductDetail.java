package selectionprgm;
import java.util.*;
public class ElectricityBill 
{
        	//method syntax:
        	//returnType methodName(parameters)
        	//{
        		//code to be executed
        	//}
	public static void Shoppingcart(String Productname, int Quantity, int Price)
	{
		int totalamount=Quantity*Price;
		System.out.println("Total Bill:"+totalamount);
		int discount=0;
		int finalBillamount;
		if(totalamount > 100) 
		{
			discount=totalamount * 10/100;
		}
		finalBillamount = totalamount - discount;
		System.out.println("Your discount:"+discount);
		System.out.println("Final Bill:"+finalBillamount);
	}
	public static void main(String[] args) 
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the Productname:");
		String Productname=ref.nextLine();
		System.out.println("Enter the Quantity:");
		int Quantity=ref.nextInt();
		System.out.println("Enter the Price:");
		int Price=ref.nextInt();
		Shoppingcart(Productname,Quantity,Price);
	}
}
