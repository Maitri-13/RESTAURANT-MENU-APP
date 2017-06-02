package restro;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "PaymentID")

public class OrderID {
	@Id
	@Column(name="PaymentID") 
	private int Orderid;
	
@Column(name="itemOrdered") 
//	private ArrayList<Product> cart;
	private String Name;


	@Column(name= "TotalPrice")
	private int totalprice;

	
	public OrderID(int Orderid,String Name,int totalprice)
    {
        this.totalprice=totalprice;
        this.Orderid = Orderid;
        this.Name = Name;
        
    }
public OrderID(){
	
}
//	public ArrayList<Product> getCart() {
//		return cart;
//	}
//
//
//	public void setCart(ArrayList<Product> cart) {
//		this.cart = cart;
//	}


	public int getOrderID() {
		return Orderid;
	}

	public void setOrderID(int orderID) {
		Orderid = orderID;
	}

	public void orderId(){
		
		System.out.println(getOrderID());
//		getCart();
		System.out.println("stored in Database");
	}
}
