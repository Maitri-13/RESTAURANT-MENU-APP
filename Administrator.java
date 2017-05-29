package   restro;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;


public class Administrator extends EmployeeLogin {
   
    
   String OrderID;
    
    
    
//	public Administrator() {
//		OrderPayment orderpayment= new OrderPayment();
//		orderpayment.attach(this);
//		
//	}
	
	public void AddMenuItem(String name, int price)
	{
		 Product product = new Product();
		 product.AddProductToMenu(name, price);	
	}
//=======================================================================

	public void AcceptFoodAssistanceRequest()
	{
		System.out.println("Asistance Accepted");
	}
	
	public void AcceptBillingAssistanceRequest()
	{
		System.out.println("Asistance Accepted");
	}
//======================================================================


//@Override
//public String updateOrderID() {
//	OrderPayment orderpayment= new OrderPayment();
//	OrderID= orderpayment.MakePayment();
//	return OrderID;
//	
//	
//	// Store this order Id into the database
//
//	
//}
	
	
	
	
}// class
	
	

