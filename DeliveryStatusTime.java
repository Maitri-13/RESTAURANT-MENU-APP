package restro;

import java.util.Scanner;

public class DeliveryStatusTime {
	
	Chef chef;
	
	public String ReadOrderStatus()
	{
		 chef= new Chef();
		 chef.setOrderTimeStatus();
		 return (chef.getOrderStatus());
		
	}

	public int ReadOrderDeliveryTime()
	{
		chef= new Chef(); 
		chef.setOrderTimeStatus();
		return (chef.getOrderTime());
	}
	
	
}
