package  restro;

import java.util.ArrayList;

public class Chef extends EmployeeLogin  implements Observer{

	private String OrderStatus;
	private int OrderTime;
	private String OrderID;
	//OrderPayment orderpayment= new OrderPayment();
	
	public Chef(OrderPayment orderpayment) {
		
		orderpayment.attach(this);
		
	}

public Chef() {
		
		
		
	}
	
	//================================getter and setters=================
	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.OrderStatus = orderStatus;
	}

	public int getOrderTime() {
		return OrderTime;
	}

	public void setOrderTime(int orderTime) {
		this.OrderTime = orderTime;
	}
//=====================================================================
	
	
	
	public void setOrderTimeStatus(){
	
		
	setOrderStatus("started Preparing");
	setOrderTime(15);
	
	}


@Override
public void  StartCooking(ArrayList<Product> cart, int orderid) 
{
	setOrderTimeStatus();	
} 
	
	
//

}