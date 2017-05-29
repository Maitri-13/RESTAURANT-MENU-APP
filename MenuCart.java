package restro;
import java.text.NumberFormat;
import java.util.ArrayList;


public class MenuCart
{
    private int itemCount;     // total number of items in the cart
    public static int totalPrice; // total price of items in the cart  
    public static ArrayList<Product> cart;
    OrderPayment orderpayment;
   
  
   
   
   
    public MenuCart()
    {
       
        itemCount = 0;
        totalPrice = 0;
        cart = new ArrayList<Product>();
    }

//======================================  Adds an item to the shopping cart.

    public void addToCart(String itemName, int price, int quantity)
    {
    	System.out.println(price);
        cart.add(new Product(itemName,price, quantity));
        totalPrice= totalPrice + (price*quantity);
        
        
    }

    
 //=======================Checks for similar items and updates the quantity.
    
    public int CheckItem1(String itemName, int price , int quantity)
    {
    	
        int temp;
        boolean flag = false;
        
        for (  temp=0;  temp<cart.size(); temp++)
        {
            if(cart.get(temp).getname().equals(itemName)) // name already in cart ie. Repeat item
                {
                    
                    int new_quantity = cart.get( temp).getquantity() + quantity;
                    cart.set( temp, new Product(itemName, price, new_quantity));
                    totalPrice= totalPrice + (price *quantity);
                    flag = true; 
                }
        }
        
        if(cart.size() == 0 || flag == false)
        {
            addToCart(itemName, price, quantity); // method call
        }
        
        return totalPrice;
       
    }
    
    //=================================================
    public String toString() // this method is called when an object needs to be "printed" 
                             // (when System.out.println() is called, this overridden method is called)
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\tPrice\tQty\tTotal\n";
        for (int i = 0; i < cart.size(); i++)
            contents += cart.get(i).toString() + "\n";
            contents += "\nFinal Amount: " + fmt.format(totalPrice);
            contents += "\n";
            return contents;
    }

   
   //========================================placing order
    public  void PlaceOrder(OrderPayment orderpayment)
    {
    	
    	  orderpayment.MakePayment( cart);
    	  
    	  
   		
    	 
    }
    
    //================================================== Cancel order
    	    public void CancelOrder()
    	    {
    	        cart.clear();
    	        totalPrice =0; 
    	        System.out.println();
    	        System.out.println("===============================");
    	        System.out.println("Your order has been cancelled");
    	        System.out.println();
    	        System.out.println("===============================");
    	        System.out.println();
    	    }
    	    
    	    public void DeleteProduct()
    		{
    			
    			cart.remove(0);
    			System.out.println("Cart Items Deleted");
    			
//    			totalPrice=0;
//    			for ( int i=0; i<=cart.size();i++)
//    				{
//    					int new_quantity = cart.get(i).quantity;
//    					double prize=cart.get(i).price;
//    					totalPrice+=prize*new_quantity;
//    					System.out.println(cart);
//    					//System.out.println(totalPrice);
//    				}
    					
    			//totalPrice=0.0;
    			//return totalPrice1;
    			//cart.remove(1);
    			//return totalPrice;
    		}

}




