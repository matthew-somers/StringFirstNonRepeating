import java.util.Scanner;

public class Tester 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter any string: ");
		String input = in.nextLine();
		
		String firstnonrepeating = "";
		for (int i = 0; i < input.length(); i++)
		{
			firstnonrepeating = input.substring(i, i+1);
			for (int j = 0; j < input.length(); j++)
			{
				if (i != j)
				{
					if (firstnonrepeating.equalsIgnoreCase(input.substring(j, j+1)))
					{
						firstnonrepeating = "";
					}
				}
			}
			
			if (!firstnonrepeating.equals(""))
				break;
		}
		
		if (firstnonrepeating.equals(""))
			System.out.println("All characters repeat at least once.\n");
		else
			System.out.println("The character " + firstnonrepeating + " is the first to not repeat");
		
	}
}
