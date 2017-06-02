package restro;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ProductDetails")
public class Product{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SerialNo") 
	private int id;
	@Column(name="ProductName")
    private  String name;
	@Column(name="Price")
    public  int price;

    public int quantity; // move the product t the menu cart
    
 
    public Product(String name, int price) { // constructor for the menu
		this.name = name;
		this.price = price;
		
	}
    
    public Product(String name, int  price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() 
    {
//        this.name;
//        this.price=0.0;
//        this.quantity=0;
    }
    public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}
		
		public int getquantity() {
			return quantity;
		}

		public void setquantity(int quantity) {
			this.quantity = quantity;
	}
    //===========================Adding to menu==========================
		 public void AddProductToMenu( String name, int price){
		   
			 this.setname(name);
			 	this.setprice(price);

			 	
			
		    }
		
//	//=================Displaying menu============================================  // not displaying the whole cart fo menu
//		  //should take the things in the database and display
		 public void DisplayMenu(List<Product> product){ 
		 
		 for (Product p : product)
		 {
			 System.out.println(p);
		 }
		 
		 
		 
		 }// NOT DISPLAYING THE MENU // this should be in the menu class after design pattern implementation
		 
		    	
		 
////==================================Adding to cart============================
		
    
  
		 
		
   
	//================================================================================
		 
		    
		 
		 
		 public String toString()
    {
        NumberFormat fmt=NumberFormat.getCurrencyInstance();
        //return (name + "/t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price*quantity));
        String abc=(name + "\t" + fmt.format(price) + "\t" + quantity + "\t"+fmt.format(price*quantity));
        return abc;
    }
}




