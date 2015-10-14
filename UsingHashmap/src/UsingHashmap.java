import java.util.Scanner;
import java.util.HashMap;

public class UsingHashmap 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		System.out.println("Enter a number: ");
		int key = input.nextInt();
		
		if (myMap.containsKey(key))
		{
			System.out.println("You entered " + myMap.get(key));
		}
		else
		{
			System.out.println("What is the word equivalent of this number?: ");
			String word = input.next();
			
			System.out.println("");
			System.out.println("Add the key and value to the map with the following line of code: \n\n\tmyMap.put("+key+",\""+word+"\");");
			System.out.println("");
			System.out.println("Retrieve value with \n\n\tString value = myMap.get("+key+")");
		}		
	}

}
