//	package restro;
//	import java.util.*;
//
//	import org.hibernate.Criteria;
//	import org.hibernate.Session;
//	import org.hibernate.SessionFactory;
//	import org.hibernate.cfg.Configuration;
//	import org.hibernate.criterion.Projections;
//	import org.hibernate.criterion.Restrictions;
//import org.hibernate.SessionFactory;
//	import javax.persistence.Column;
//	import javax.persistence.Entity;
//	import javax.persistence.GeneratedValue;
//	import javax.persistence.GenerationType;
//	import javax.persistence.Id;
//	import javax.persistence.Table;
//	import org.hibernate.Session;
//	import org.hibernate.SessionFactory;
//	import org.hibernate.cfg.Configuration;
//	public class DriverOfRestro {
//
//		
//		int returnValue;
//		SessionFactory factory=new Configuration().configure().addAnnotatedClass(EmployeeLogin.class).buildSessionFactory();
//	    Session session=factory.getCurrentSession();
//		
//	    Scanner scan = new Scanner(System.in);
//		
//	    EmployeeLogin employee;
//	    Product product;
//	    MenuCart menucart;
//	    Customer customer;
//	    List<EmployeeLogin> employeedetails = null;
//	    
//	    DriverOfRestro(){
//	    	employee = new EmployeeLogin();
//	    	product = new Product();
//	    	}
//	    
//	   //=================================================================== 
//		public void AdminCredsToDatabase()
//		{
//			 session=factory.getCurrentSession();
//		    
//		    System.out.println("test");
//		    try{
//
//		    	EmployeeLogin AdminLogin=new EmployeeLogin("Admin","Admin");
//		    	session.beginTransaction();
//		    	session.save(AdminLogin);
//		    	session.getTransaction().commit(); 
//		    }
//		    catch(Exception e)
//		    {
//		    	
//		    	System.out.println("appemt" + e.getMessage());
//		    }
//		    
//		} 
//		
//		// =============================================================================	
//		public void AdminLOginCheck(){   
//		    
//		    
//		    //====Check admin connections====
//		    
//		    System.out.println("Admin Enter username");
//			String UserName=scan.next();
//			System.out.println("Adimn Enter password");
//			String Password= scan.next();
//		   
//		          
//		    	session=factory.getCurrentSession();
//		          
//		           try{
//		               session.beginTransaction();               
//		             employeedetails  = session.createQuery("from EmployeeLogin").list();   // display the login thru query
//		   
//		               session.getTransaction().commit();           
//		               
//		           } catch (Exception e){
//		               System.out.println("System Error" + e.getMessage());   
//		           }
//
//		          returnValue = employee.VerifyLogin(employeedetails, UserName, Password);	
//		}// AdminLoginCheck
//		
//		// =============================================================================	
//		public void CreateMenu()
//		{
//			  session=factory.getCurrentSession();
//       	   
//			    try{	
//			    	session.beginTransaction();
//			    	
//			    	Product product1 = new Product();
//			    	Product product2 = new Product();
//			    	
//			    	
//			    	product1.AddProductToMenu("cheese Pizze", 5);
//			    	session.save(product1);
//			    	
//			    	product2.AddProductToMenu("chicken Pizze", 8);
//			    	session.save(product2);
//				         
//				         System.out.println("Enter the name of the item into Database");
//					     String name=scan.next();
//					        
//					     System.out.println("Enter the unit price into Database");
//					     int price=scan.nextInt();
//					     
//					    product.AddProductToMenu(name, price);
//				
//					    
//					     session.save(product);
//				      
//				       session.getTransaction().commit();  
//			    }
//			    catch(Exception e)
//			    {
//			    	System.out.println("error loding item into databse" + e.getMessage());
//			    }      
// }	// Creating menu					       
//				       
////====================================================================
//		public void DisplayMenu(){
//			session=factory.getCurrentSession();
//	           List<Product> productlist = null;
//	           try{
//	               session.beginTransaction();               
//	             productlist  = session.createQuery("from Product").list();   
//	   
//	               session.getTransaction().commit();           
//	               
//	           } catch (Exception e){
//	               System.out.println("System Error" + e.getMessage());   
//	           }
//
//	        product.DisplayMenu(productlist);
//   
//		}// Display menu
//		
////============================================================================
//public void addProductTOCart(){
//	System.out.println("Enter product you want to buy");
//    String itemName = scan.next();
//    
//    System.out.println("Enter price");
//    int price1 = scan.nextInt();
//    
//    System.out.println("Enter quantity");
//    int quantity= scan.nextInt();
//    menucart= new MenuCart();
//    menucart.addToCart(itemName, price1, quantity);
//   System.out.println(menucart.toString());
//}// Adding to cart
//
////===================================================================
//public void CustomerCredsToDatabase (){
//	session=factory.getCurrentSession();
//    try{
//
//    	session.beginTransaction();
//    	Customer customer = new Customer ("Cust", "Cust");	 
//    	session.save(customer);
//    	session.getTransaction().commit(); 
//    	}
//    		catch(Exception e)
//    	{
//    	
//    	System.out.println("login failed" + e.getMessage());
//    }	
//
//} // placning order
//
////=================================================================
//
//public void CustomerCredsVerify(){
//	System.out.println("Customer enter you name");
//	String Name= scan.next();
//	System.out.println("Customer your card number");
//	 String CardNumber = scan.next();
//
//	 customer= new Customer();
//	 customer.setCardNumber(CardNumber);
//		customer.setName(Name);
//		
//		
//		session=factory.getCurrentSession();
//          List<Customer> customerdetails = null;
//           try{
//               session.beginTransaction();               
//               customerdetails  = session.createQuery("from Customer").list();   // display the login thru query
//   
//               session.getTransaction().commit(); 
//              
//               
//           } catch (Exception e){
//               System.out.println("System Error" + e.getMessage());   
//           }
//
//            returnValue = customer.VerifyLogin(customerdetails, Name, CardNumber);
//          
//}// customer creds verified
//	
////============================================================================
//public void PlaceOrder(){
//		if (returnValue==1)
//        { 
//     	   
//     	   System.out.println("test");
//     	   session=factory.getCurrentSession();
//     	   session.beginTransaction(); 
//     	   System.out.println("test");
//     	   Administrator admin = new Administrator();
//     	 String s =  admin.updateOrderID();
//     	//OrderId oi = new OrderId();
//     	 //oi.setOrderId(s);
//     	   		session.save(admin);
//				       session.getTransaction().commit();
//				       
//				       System.out.println("test");
//        }
//     	   
//        }// place order
//
////==============================================================================
//		public void ChefLoginToDatabase(){
//			session=factory.getCurrentSession();
//		    try{
//	
//		    	EmployeeLogin ChefLogin=new EmployeeLogin("Chef","Chef");
//		    	
//		    	
//		       // EmployeeLogin ChefLogin=new EmployeeLogin("Restro_Chef","Restro_Chef");
//		    
//			session.beginTransaction();
//	     
//			session.save(ChefLogin);
//	       session.getTransaction().commit(); 
//		    }
//		    catch(Exception e)
//		    {
//		    	
//		    	System.out.println("appemt" + e.getMessage());
//		    }	
//		}// chef login to database
//
//	//==============================================================================
//public void VerifyChefLogin(){
//	System.out.println("Chef Enter username");
//	String UserName=scan.next();
//	System.out.println("Chef Enter password");
//	String Password= scan.next();
//   
//          
//    	session=factory.getCurrentSession();
//          
//           try{
//               session.beginTransaction();               
//             employeedetails  = session.createQuery("from EmployeeLogin").list();   // display the login thru query
//   
//               session.getTransaction().commit();           
//               
//           } catch (Exception e){
//               System.out.println("System Error" + e.getMessage());   
//           }
//
//            returnValue = employee.VerifyLogin(employeedetails, UserName, Password);
//}// verify chef creds
//
//	//=========================================================================================
//	public void SetTimeandStatus(){
//		System.out.println("Enter Delivery status");
//		String OrderStatus= scan.next();
//		
//		System.out.println("Enter Delivery time");
//		int OrderDeliveryTime = scan.nextInt();
//		Chef chef= new Chef();
//		chef.setOrderStatus(OrderStatus);
//		chef.setOrderTime(OrderDeliveryTime);
//		System.out.println(chef.getOrderStatus() + "    YAY");
//		System.out.println(chef.getOrderTime() + "    YAY");
//}// settnig time and date
//	
//	//=========================================================================================
//		public void ReadTimeandStatus(){
//			customer= new Customer();
//			customer.ReadOrderStatus();
//			customer.ReadOrderTime();
//		}// read status and time
//	
//	//=========================================================================================
//			public void GiveReview(){
//				System.out.println("Review food or Resturant?");
//				String ReviewChoice = scan.next();
//				Review review = new Review();
//				
//				if (ReviewChoice.equals("food"))
//				{
//					review.setFood(true); 
//					customer. WriteReview();	
//				}
//				else if (ReviewChoice.equals("resturant"))
//				{
//					review.setResturant(true); 
//					customer. WriteReview();
//				}
//				else
//					System.out.println("invalid input");
//			} // give review
//			
//}// class