package restro;

public class Assistance {
	
	boolean billingAssistance,foodAssistance;
	
	public String generateAssistanceRequest(int a) 
	{
		String x = null;
		Administrator A=new Administrator();
		if(a==1)
		{
			System.out.println("Hey Admin ...... The customer needs an assistance of food. ");
			foodAssistance=true;		
			A.AcceptFoodAssistanceRequest();
			x="Assistance Request successfully sent";		
		}
		
		else if(a==2)
		{
			System.out.println("Hey Admin ...... The customer needs an assistance of billing");
			billingAssistance=true;
			A.AcceptBillingAssistanceRequest();
			x="Assistance Request successfully sent";
			
		}
		return x;
	}

}
