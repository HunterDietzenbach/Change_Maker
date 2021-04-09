
public class Calc {
	int remaning = HUD.change;
	int counter = 0;
	static int coins[] = {0,0,0,0,0,0,0,0};
	public Calc()
	{
		
		for (int i = 7; i >=0; i--)
		{
			//System.out.println(reader.currancyVal[i]);
			 counter = 0;

			  while(remaning - reader.currancyVal[i] >= 0 )
			  { 
				  remaning = remaning - reader.currancyVal[i]; 
			     counter++; 
			   
			  }

			coins[i] = counter; 
		}
		System.out.println("thier change is..");
		for (int i = 7; i >=0; i--)
		{
					System.out.println("     " + coins[i] + " X " + reader.currancyVal[i] + " " + reader.currancyName +"coin(s)." );
		}
	}
}