import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class reader  {


		static int currancyVal[] = {0,0,0,0,0,0,0,0};
		static String currancyName = "hi";
	      Scanner file = new Scanner( new File( "/Users/29wil/eclipse-workspace/Change Maker/src/currancy.txt" ));
	  
	     public reader() throws IOException
	     {
				
	    	 currancyName = file.nextLine();
	    	 for (int i = 0; i < 8; i ++ )
	    	 {
	    		  currancyVal[i] = (file.nextInt());
	    	 }
	    	 
		   while(currancyName.equals(HUD.name) == false && file.hasNext())
		     {
			   currancyName = file.next();
	
		    	 for (int i = 0; i < 8; i ++ )
		    	 {
		    		  currancyVal[i] = (file.nextInt());
		    	 }
		    	
		    	 
		    	
		     }
	   }
	      
	      
		
	}
	 
					
					
