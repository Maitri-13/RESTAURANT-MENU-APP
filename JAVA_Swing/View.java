package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

 class View extends JFrame implements ActionListener, WindowListener{

	 private static JLabel item1, item2, item3;
		private static JLabel price1, price2, price3;
		private static JButton addToCart1, addToCart2, addToCart3, login;
		private static JButton status, deliveryTime, reviewFood, reviewResturant, request, cancelOrder, placeOrder;
		private static JPanel  jpanelMenu ;
	//	========================================================== fro addToCart
		private static int totalPrice;
		private static JLabel quantity, totalAmount;
		private static JFrame jframeaddToCart, jframeFoodReview, jframeResturantReview,jframeLogin  ;
		private static JPanel JpaneladdToCart, jpanelFoodReview, jpanelResturantReview ;
		
		private static JTextArea jtextAreaFoodReview,  jtextAreaResturantReview, itemquantity ;
		public static JTextArea ja;
		public static MenUlist[] menuList;
		
     View()
    {
    	 super("Menu"); // making the menu JFrame. Calling the super constructor since we have extended the JFrame
    	 
    	 totalPrice = 0;
    	 menuList = new MenUlist[3];
    	
    	 menuList[0] = new MenUlist("Cheeze Pizza"); 
    	 menuList[1] = new MenUlist("Chicken Pizza"); 
    	 menuList[2] = new MenUlist("Shezwan Pizza"); 
    	 
    	//=========================addToCart frame===============================================
    	
    	 jframeaddToCart = new JFrame("addToCart");
    	 jframeaddToCart.setSize(500, 500);
    	 jframeaddToCart.setVisible(false);
    	 
    	 JPanel jpanelCart1 = new JPanel(new GridLayout(1,1));
    	 JLabel jlableCart1 = new JLabel("Your Order:");
    	 jpanelCart1.add(jlableCart1);
    	 jframeaddToCart.add(jpanelCart1,BorderLayout.NORTH);
    	 
    	 JpaneladdToCart= new JPanel(new GridLayout(3,3));
//    	 JLabel jlableCart3 = new JLabel();
//    	 JpaneladdToCart.add(jlableCart3);
    	 jframeaddToCart.add(JpaneladdToCart,BorderLayout.CENTER);
    	 
    	 
    	 JPanel jpanelCart2 = new JPanel(new GridLayout(1,2));
    	 JLabel jlablecart2 = new JLabel("Your Total:");
    	 ja = new JTextArea();
    	 ja.setText("0");
    	 ja.setEditable(false);
    	 jpanelCart2.add(jlablecart2);
    	 jpanelCart2.add(ja);
    	 placeOrder = new JButton("place order");
    	 cancelOrder= new JButton("cancel order");
    	 jpanelCart2.add(placeOrder);
    	 jpanelCart2.add(cancelOrder);
    	 jframeaddToCart.add(jpanelCart2,BorderLayout.SOUTH);	
		
		
		//=========================== for food review=================
		
		jframeFoodReview = new JFrame("Food Review");
   		JPanel jpanelFoodReview = new JPanel(new GridLayout(5,3, 3,3));
		 jtextAreaFoodReview = new JTextArea(80,80);
	
		 jpanelFoodReview.add(jtextAreaFoodReview);
		 jframeFoodReview.add(jpanelFoodReview);
		 jframeFoodReview.setVisible(false);
		 jframeFoodReview.setSize(500, 500);
	   	jframeFoodReview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
	   	 
//=========================== for Resturant review=================
			
			jframeResturantReview = new JFrame("Resturant Review");
	   		JPanel jpanelReview = new JPanel(new GridLayout(5,3, 3,3));
			 jtextAreaResturantReview = new JTextArea(80,80);
			 jpanelReview.add(jtextAreaResturantReview);
			 jframeResturantReview.add(jpanelReview);
			 jframeResturantReview.setVisible(false);
			 jframeResturantReview.setSize(500, 500);
		   	 jframeResturantReview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
////=========================For Login of admin anad chef===============================================
//		   	 
//		   	 
//		   	jframeLogin = new JFrame("Login");
//	   		JPanel jpanelLogin = new JPanel(new GridLayout(5,3, 3,3));
//			 JAdminLogin = new JButton ("Admin login");
//			JChefLogin = new JButton ("Chef Login");
//			 jframeLogin.add(jpanelLogin);
//			 jframeLogin.setVisible(false);
//			 jframeLogin.setSize(200, 200);
//			 jframeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 
//======================================== menu frame=============================
				
				this.jpanelMenu = new JPanel(new GridLayout(5,3, 3,3));
		
					
//=========================creating the buttons=========================
					item1= new JLabel("Cheeze Pizza");
					item2= new JLabel("Chicken Pizza");
					item3= new JLabel("Shezwan Pizza");
					price1= new JLabel("5$ ");     	
					price2= new JLabel("6$ ");
					price3= new JLabel("8$ ");
					addToCart1= new JButton("Add to addToCart");
					addToCart2= new JButton("Add to addToCart");
					addToCart3= new JButton("Add to addToCart");
					status= new JButton("See order status");
					deliveryTime= new JButton("See order delivery time");
					reviewFood= new JButton("Review Food");
					reviewResturant= new JButton("Review resturant");
					request= new JButton("Request assistance");
					login= new JButton ("Employee login");
					
					
					//=================================================
					
					jpanelMenu .add(item1);
					jpanelMenu .add(price1);
					jpanelMenu .add(addToCart1);
					jpanelMenu .add(item2);
					jpanelMenu .add(price2);
					jpanelMenu .add(addToCart2);
					jpanelMenu .add(item3);
					jpanelMenu .add(price3);
					jpanelMenu .add(addToCart3);
					jpanelMenu .add(status);
					jpanelMenu .add(deliveryTime);
					jpanelMenu .add(reviewFood);
					jpanelMenu .add(reviewResturant);
					jpanelMenu .add(request);
					jpanelMenu.add(login);
					
					
//===========================Menu class action listner============================
					addToCart1.addActionListener(this); 
					addToCart2.addActionListener(this);
					addToCart3.addActionListener(this);
					status.addActionListener(this);
					deliveryTime.addActionListener(this);
					reviewFood.addActionListener(this);
					reviewResturant.addActionListener(this);
					request.addActionListener(this);
					login.addActionListener(this);
					placeOrder.addActionListener(this);
					cancelOrder.addActionListener(this);
					
					add(jpanelMenu ,BorderLayout.NORTH);
					setSize(600,600);
					setVisible(true);
					 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// write the close on exit
					addWindowListener(this);
					
					
			}
			
    public static void viewCart(String item, String price)
     { 
    	
    	jframeaddToCart.setVisible(true);
    	totalPrice = totalPrice + Integer.parseInt(price);
    	for(int i = 0;i<3;i++)
    	{ 
    		int tempquantity=menuList[i].q;
    		if(menuList[i].Menu == item)
    		{
    			if(menuList[i].q == 0)
    			{
    				JLabel itemName = new JLabel(item);
    				JpaneladdToCart.add(itemName);
    				JLabel itemPrice = new JLabel(price);
    				JpaneladdToCart.add(itemPrice); 	
//    				itemquantity = new JTextArea(Integer.toString(tempquantity));
//    				JpaneladdToCart.add(itemquantity);
    			}
    			
    			menuList[i].q++;
    			
    			
    		}
    		
    		
    	}
    	 
    	JpaneladdToCart.revalidate();
    	 ja.setEditable(true);
    	 ja.setText(Integer.toString(totalPrice));
    	 ja.setEditable(false);
     }
    
    public static void writeFoodReview ()
    {
    	jframeFoodReview.setVisible(true);	
    		
   }
    
    public static void writeResturantReview ()
    {
    	jframeResturantReview.setVisible(true);
    		 
   }
    
    public static void requestAssistance()
    {
    	 JOptionPane.showMessageDialog(null, "Your request will be attended soon!", "Assiatance request", 2);
    	//System.out.println("Your request will be attended soon!");
    }
    
    public static void viewStatus()
    {
    	JOptionPane.showMessageDialog(null, "Delivery status!", "Delivery status", 2);
    }
    
    public static void viewTime ()
    {
    	//create object
    	int i = 20;
    	JOptionPane.showMessageDialog(null, i, "abc", 2);
    }
     
    public static void login()
    {
    	//JOptionPane.showMessageDialog(null, "Delivery status!", "Delivery status", 2);
    	
    	LoginFrame loginframe= new LoginFrame();
    	
    }
    public static void Cancelorder(){
    	JOptionPane.showMessageDialog(null, "Cancelled your order", "Cancel Order", 2);
    	// After this, the cart should close and only the main menu should be displayed.
    }    
    
    public static void PlaceOrder(){
    	
    	pay p= new pay(totalPrice);
    	
    }

    
    
			@Override
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();  // line gets the button that is clicked
			try
			{
			if (o == addToCart1)
			{
			
				viewCart(this.item1.getText(), (this.price1.getText()).replace("$", "").trim());
				
				
			}
			
			else if (o == addToCart2)
			{	viewCart(this.item2.getText(),this.price2.getText().replace("$", "").trim());
			
			}
			else if(o== addToCart3){
				viewCart(this.item3.getText(),this.price3.getText().replace("$", "").trim());
		
			}
			else if(o== status)
			
				viewTime();
			
			else if(o== deliveryTime)
				
				viewStatus();

			else if(o== reviewFood)
				writeFoodReview();
			
			else if (o == reviewResturant)
				writeResturantReview();
			
			else if(o== request)
				requestAssistance();

			else if(o==login)
				login();
			
			else if(o==cancelOrder)
				Cancelorder();
			
			else if(o==placeOrder)
				PlaceOrder();

			}
			catch(Exception en)
			{
				System.out.println(en.toString());;
			}
		
		
		
		
		setVisible(true);
		
    	
		
		
	
    }

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
}