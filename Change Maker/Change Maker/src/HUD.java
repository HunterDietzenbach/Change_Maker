import java.util.Scanner;
public class HUD {
	static String name = "hi";
	static int cost;
	static int change;
	static int paid;
	public HUD()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("what currancy was the purchase");
		 name = input.nextLine();
		System.out.println("How much was the purchase?");
		 cost =  input.nextInt();
		 System.out.println("How much did they pay?");
		 paid =  input.nextInt();
		 
		 change = paid - cost;
		 
		
	}
}
