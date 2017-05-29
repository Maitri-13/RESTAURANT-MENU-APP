package restro;


import java.util.*;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.SessionFactory;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Driver {

    public static void main(String[] args) {

        
        Product product = new Product();
        MenuCart menucart= new MenuCart();
        Customer customer ;
        int totalprice;
        String itemName ;
        Customer customer1= new Customer();
                Scanner scan = new Scanner(System.in);
                Chef c=new Chef();
                
        
                
                //=========================================Enter details into Database==========
//                ;
                
                EmployeeLogin employee = new EmployeeLogin();
                
                SessionFactory factory=new Configuration().configure().addAnnotatedClass(EmployeeLogin.class).buildSessionFactory();
                Session session=factory.getCurrentSession();
                
               
                try{
        
                    EmployeeLogin AdminLogin=new EmployeeLogin("Admin","Admin");
                    
                   
                
                session.beginTransaction();
             
                
                session.save(AdminLogin);
               session.getTransaction().commit();
                }
                catch(Exception e)
                {
                    
                    System.out.println("appemt" + e.getMessage());
                }
                
               // =============================================================================
                
                //==========================Check admin connections=========================
                System.out.println("Weldome Admin");
                System.out.println();
                System.out.println("Enter username");
                String UserName=scan.next();
                System.out.println("Enter password");
                String Password= scan.next();
               
                      
                    session=factory.getCurrentSession();
                       List<EmployeeLogin> employeedetails = null;
                       try{
                           session.beginTransaction();               
                         employeedetails  = session.createQuery("from EmployeeLogin").list();   // display the login thru query
               
                           session.getTransaction().commit();           
                           
                       } catch (Exception e){
                           System.out.println("System Error" + e.getMessage());   
                       }


                       int returnValue = employee.VerifyLogin(employeedetails, UserName, Password);
                       if (returnValue==1)
                       {
                        
                                    //CREATING MENU==========================================================================
                           session=factory.getCurrentSession();
                           
                            try{    
//                                Administrator admin = new Administrator();
//                                     admin.AddMenuItem( "cheese Pizze", 5.0);
//                                     admin.AddMenuItem( "chicken Pizze", 8.0);
                                // Should cal the admin class function rather than product.
                                 session.beginTransaction();
ArrayList<Product> cart=new ArrayList<Product>();
                                
                                Product product1 = new Product();
                                Product product2 = new Product();
                                
                                
                                product1.AddProductToMenu("cheesePizza", 5);
                                session.save(product1);
                                
                                product2.AddProductToMenu("chickenPizza", 8);
                                session.save(product2);
                                     
                                
                                    System.out.println();
                                     System.out.println("Enter name of new product you want ot add to the menu");
                                     String name=scan.next();
                                        
                                     System.out.println("Enter the unit price of that product");
                                     int price=scan.nextInt();
                                     
                                    product.AddProductToMenu(name, price);
                            
                                    
                                     session.save(product);
                                  
                                   session.getTransaction().commit();  
                            }
                            catch(Exception e)
                            {
                                System.out.println("error loding item into databse" + e.getMessage());
                            }      
               }                               
                                   
               //=================================DISPLAYING MENU========================
               
                       session=factory.getCurrentSession();
                       List<Product> productlist = null;
                       try{
                           session.beginTransaction();               
                          
                         productlist  = session.createQuery("from Product").list();
                         System.out.println();
                         System.out.println();
                         System.out.println("==========Welcome to Restro==========");
                           System.out.println("============Today's Menu==========");
                           session.getTransaction().commit();
                           System.out.println();
                            
                           
                       } catch (Exception e){
                           System.out.println("System Error" + e.getMessage());   
                       }


                    product.DisplayMenu(productlist);
                    System.out.println();
                     System.out.println();
                    
                    
                  //=========================================chef login ==========
                    
          /*          
                       session=factory.getCurrentSession();
                        try{
                
                            EmployeeLogin ChefLogin=new EmployeeLogin("Chef","Chef");
                            
                            
                           // EmployeeLogin ChefLogin=new EmployeeLogin("Restro_Chef","Restro_Chef");
                        
                        session.beginTransaction();
                     
                        session.save(ChefLogin);
                       session.getTransaction().commit();
                        }
                        catch(Exception e)
                        {
                            
                            System.out.println("appemt" + e.getMessage());
                        }    
                        //=========================================Verifying Chef details=================================
                        System.out.println("Weldome Chef");
                        System.out.println();
                        System.out.println(" Enter username");
                        UserName=scan.next();
                        System.out.println("Enter password");
                        Password= scan.next();
                       
                              
                            session=factory.getCurrentSession();
                               //List<EmployeeLogin> employeedetails = null;
                               try{
                                   session.beginTransaction();               
                                 employeedetails  = session.createQuery("from EmployeeLogin").list();   // display the login thru query
                       
                                   session.getTransaction().commit();           
                                   
                               } catch (Exception e){
                                   System.out.println("System Error" + e.getMessage());   
                               }
                               int ChefreturnValue = employee.VerifyLogin(employeedetails, UserName, Password);
                               
            */           
            //==================================select item from menu and add to cart====================
                               
                               System.out.println("Welcome Customer");
                               
           String keepShopping;                                          
              do
               {
            	  System.out.println();       		
               System.out.println("Enter the product name you want to buy");
                itemName = scan.next();
               System.out.println();
               System.out.println("Enter quantity of the product");
               int quantity= scan.nextInt();
               //menucart.CheckItem1(itemName, quantity);
               totalprice= menucart.CheckItem1(itemName,product.getprice(),quantity);
             // totalprice= menucart.addToCart(itemName,product.getprice(), quantity);
              
              
              System.out.println(menucart.toString());
             
              //============================= add more items from the menu to the cart================
              	
              System.out.println("Continue shopping? y/n");
              	
              				keepShopping=scan.next();
              }while (keepShopping.equals("y"));  
              	
              	

      //==========================Place order========================================
        //================= For storing the customer name and Number in the Database==============
        
        if (keepShopping.equals("n"))
        
     
        	System.out.println("Do you want to delete product? y/n");
           String deleteProduct=scan.next();
        	if (deleteProduct.equals("y"))
        		
        		menucart.DeleteProduct();
        	
        
   
        
        
       
        
        	
        		System.out.println("do you want to place order? y/n");
            	String makepayment=scan.next();
        	
            	  if(makepayment.equals("y"))  
                 {
                               session=factory.getCurrentSession();
                                            try{
                                    
                                                session.beginTransaction();
                                               customer = new Customer ("Cust", "Cust");
                                                
                                            
                                            session.save(customer);
                                           session.getTransaction().commit();
                                            }
                                            catch(Exception e)
                                            {
                                                
                                                System.out.println("login failed" + e.getMessage());
                                            }    
              
              
                                            //========================verify customer name=====================
                                            System.out.println();
                                            System.out.println("Enter your credit card details");
                                            System.out.println();
                                            System.out.println("Enter you name");
                                            String Name= scan.next();
                                            System.out.println("Enter your card number");
                                             String CardNumber = scan.next();
                
                                            
                                             customer1.setCardNumber(CardNumber);
                                                customer1.setName(Name);
                                                
                                                
                                                session=factory.getCurrentSession();
                                                  List<Customer> customerdetails = null;
                                                   try{
                                                       session.beginTransaction();               
                                                       customerdetails  = session.createQuery("from Customer").list();   // display the login thru query
                                           
                                                       session.getTransaction().commit();
                                                      
                                                       
                                                   } catch (Exception e){
                                                       System.out.println("System Error" + e.getMessage());   
                                                   }

        	                   returnValue = customer1.VerifyLogin(customerdetails,Name,CardNumber);
                                                  
                                                        if (returnValue==1)                                                     
                                                        {
                                                       System.out.println("Do you want to make payment Y/N");
                                                         String makepayment1=scan.next();
                                                         if(makepayment1.equals("y"))
                                                           {
                                                            OrderPayment op = new OrderPayment();
                                                                                                      
                                                            Chef chef= new Chef(op);    
                                                                                        
                                                            menucart.PlaceOrder(op);
                                               
                                                            
                                                               OrderID orderid = new OrderID(op.getPaymentID(),itemName,totalprice);
                                                              
                                                               session=factory.getCurrentSession();
                                                            session.beginTransaction();
                                                               session.save(orderid);
                                                            session.getTransaction().commit();
                                                           }
                                                        
                 
                                                         else if(makepayment.equals("n"))  // Cancel the order
                                                         {
                                                             menucart.CancelOrder();
                                                             session=factory.getCurrentSession();
                                                               List<Product> productlist1 = null;
                                                               try{
                                                                   session.beginTransaction();               
                                                                  
                                                                 productlist1  = session.createQuery("from Product").list();
                                                                 System.out.println();
                                                                 System.out.println();
                                                                 System.out.println("==========Welcome to Restro==========");
                                                                   System.out.println("============Today's Menu==========");
                                                                   session.getTransaction().commit();
                                                                   System.out.println();  
                                                                       } // try
                                                               catch (Exception e){
                                                                   System.out.println("System Error" + e.getMessage());   
                                                               }


                                                            product.DisplayMenu(productlist);
                                                            System.out.println();
                                                             System.out.println();                                                     
                                                        }// else if
                                                                                                
                                                    }// customer login success
    
                 }// make payment
        	//} // else
           
                
                  //=========================================to see time and status=========
           
                    System.out.println("Do you want to know your order status and time it will take to deliver? Y/N");                                        
                    String knowstatustime= scan.next();
                    if(knowstatustime.equals("y"))
                    {                
                    Chef chef= new Chef();
                    System.out.println();
                    System.out.println("Setting the time and status");
                    System.out.println();
                    
            customer1.ReadOrderStatus();
            customer1.ReadOrderTime();}
                    
                    
                    
        			//==================Update the status and time=========================
        			
                    System.out.println("Hey Chef ...... Would you like to update the order ? ");				



                                    System.out.println("Enter Delivery status");
                    				String OrderStatus= scan.next();
                    				
                    				System.out.println("Update Delivery time in mins");
                    				int OrderDeliveryTime = scan.nextInt();
                    				
                    				c.setOrderStatus(OrderStatus);
                    				c.setOrderTime(OrderDeliveryTime);
                    				System.out.println(c.getOrderStatus());
                    				System.out.println(c.getOrderTime() + " mins ");

                    			      
                    				customer1.ReadOrderStatus();
                    				customer1.ReadOrderTime();
                    				
                    				
                    		          
                                	//===========================Assistance===================================
                        			
                        			
                        			System.out.println("Press 1 for Food Assistance, 2 for Billing Assistance ");
                        			Scanner s=new Scanner(System.in);
                        			
                        			int foodbilling=s.nextInt();
                        			Assistance a=new Assistance();
                        			if(foodbilling==1)
                        			{
                        			a.generateAssistanceRequest(foodbilling);
                        			}

                        			if(foodbilling==2)
                        			{
                        				a.generateAssistanceRequest(foodbilling);
                        			}    				
                    			        				
                    
                  //===========================Review===================================
                    
                    System.out.println("Review food or resturant?");
                    String ReviewChoice = scan.next();
                    Review review = new Review();
                    
                    if (ReviewChoice.equals("food"))
                    {
                        review.setFood(true);
                        customer1. WriteReview();    
                        
                        System.out.println("Enter the comment below. ");
                        String k=scan.next();
                        System.out.println("Thanks for your review comment ");
                    }
                    else if (ReviewChoice.equals("resturant"))
                    {
                        review.setResturant(true);
                        customer1. WriteReview();
                        System.out.println("Enter the comment below. ");
                        String k=scan.next();
                        System.out.println("Thanks for your review comment ");
                    }
                    else
                        System.out.println("invalid input");

                   }
                }
    
 