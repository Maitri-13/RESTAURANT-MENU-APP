package restro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class OrderPayment {
	
	
	private static int PaymentID;

	
	
	
	
	
	public static int getPaymentID() {
		return PaymentID;
	}
	public static void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}

	
	
	
	

	 public List<Observer> observers;
	 

 
 public OrderPayment()
 {
	 this.observers = new ArrayList<Observer>();
 }
 void attach(Observer o)
 {
	 observers.add(o);


	 
 }
 
 public void Notify(ArrayList<Product> cart, int paymentid)
 {
//     for(int i=0;i<this.observers.size();i++)
//        {
//            System.out.println(observers.get(i).getClass());
//        }
//     
     for (Observer ob: observers)
     {
         
         ob.StartCooking(cart, paymentid);
     	
     	
     }
 }

 public int MakePayment(ArrayList<Product> cart)
 {
	 System.out.println();
	 System.out.println("==================================================");
		 System.out.println("payment Successfull!");
		 System.out.println();
		 Random rand = new Random();
         PaymentID=rand.nextInt(100) + 1;
		 System.out.println("Your Payment Id is: " + PaymentID );
		 System.out.println();
		 System.out.println("==================================================");
		 System.out.println();
		 Notify(cart, PaymentID);
		 return PaymentID;
		 
		 		 
} // function
 
 public String PaymentID(String PaymentID){
	 return PaymentID;
 }
 
} // class
