package my.codekata;

import java.util.Scanner;

public class stringCalculator
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Number:\n");

		String input;
		input = reader.nextLine();

		int result = add(input);

		System.out.println("Addition of the numbers is:\t"+result);
		reader.close();
	}//main

	public static int add(String numbers)
	{
		int sum = 0;
		if(numbers.equalsIgnoreCase(""))
			sum = 0;
		else if(numbers.length() == 1)
		{
			//commenting code here from git_session
		}//else-if
		else if(numbers.contains(","))
		{
			String[] num = numbers.split(",");

			for(String itr : num)
			{
				sum = sum+Integer.parseInt(itr);
			}//for
		}//else-if
		return sum;
	}//add
}//stringCalculator