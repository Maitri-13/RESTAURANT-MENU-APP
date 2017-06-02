package restro;

import java.util.Scanner;

public class Review {

	private boolean Food;
	private boolean Resturant;
	
Review(){
	Food=false;
	 Resturant=false;
}
	//==========================================================================getters and setters
	public boolean isFood() {
		return Food;
	}


	public void setFood(boolean food) {
		Food = food;
	}


	public boolean isResturant() {
		return Resturant;
	}


	public void setResturant(boolean resturant) {
		Resturant = resturant;
	}


//=================================================================================
	
	public void Review()
	{
		
		
		if (Food == true)
			
			System.out.println("review food!");
		
		else if (Resturant = true)
			System.out.println("review Resturant");
	}
	
		
}
