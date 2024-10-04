import java.util.Scanner;

public class IT24101728Lab7Q3{
	public static void main(String []args){

	Scanner input =  new Scanner(System.in);

	for( int customer = 1 ; customer <= 5 ; customer++)
	{
		System.out.println("Customer " + customer);
	
		System.out.print("Enter total bill amount: ");
		double billAmount = input.nextDouble();

		System.out.print("Enter mode of payment ( C for cash, O for other): ");
		char modePayment = input.next().charAt(0);

		if(modePayment == 'C' || modePayment == 'c')
		{
			double discount = (billAmount/100.0)*5.0;
			double discountedBill = billAmount - discount;

			System.out.println("Discount is : " +discount);
			System.out.println("Amount to be paid: " +discountedBill);
			System.out.println();
		}

		else if(modePayment == 'o' || modePayment == 'O')
		{
			System.out.println("No discount applicable");
			System.out.println("Amount to be paid: " +billAmount);
			System.out.println();
		}
		
		else
		{
			System.out.println("Payment Mode is Not Valid");
			System.out.println();
		}
	}
}

}

		

		