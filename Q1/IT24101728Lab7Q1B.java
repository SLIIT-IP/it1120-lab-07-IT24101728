import java.util.Scanner;

public class IT24101728Lab7Q1B{
	public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int count =1;

	while(count<=3)
	{
		System.out.println("Student: " + count);
		System.out.print("Enter marks: ");
		double mark1 = input.nextDouble();
		double mark2 = input.nextDouble();
		double mark3 = input.nextDouble();
		double mark4 = input.nextDouble();

	double average = (mark1 + mark2 + mark3 + mark4)/4.0;
	
	System.out.println("Average is: " +average);

	if(average <= 49.0)
	{
		System.out.println("Overall Grade is : Fail");
	}

	else if(average <=74.0 && average > 49.0)
	{
		System.out.println("Overall Grade is : Credit");
	}

	else 
	{
		System.out.println("Overall Grade is : Distinction");
	}
	
	count = count + 1;
	}


	}
}





