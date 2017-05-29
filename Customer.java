package restro;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.classmate.AnnotationConfiguration;

@Entity
@Table(name= "CustomerDetails")
public class Customer {
	 
	 @Id
	private String Name;
	private String CardNumber;
	
	
	public Customer() {
		
		Name = null;
		CardNumber = null;
	}
	
	
	
	
	public Customer(String name, String cardNumber) {
		super();
		this.Name = name;
		this.CardNumber = cardNumber;
	}




	public String getName() {
		return Name;
	}

	
	public String getCardNumber() {
		return CardNumber;
	}
	


	public void setName(String name) {
		this.Name = name;
	}



	public void setCardNumber(String cardNumber) {
		this.CardNumber = cardNumber;
	}
//==============================verify login======================
	public int  VerifyLogin(List<Customer> loginlist, String UserName, String cardnumber)
	{
	
		//Customer cust= new Customer();
		
		//List<EmployeeLogin> employeedetailsoflogin = obj.getUserNameFromSQL();
        
        for(Customer a:loginlist )
            
        {
            if(UserName.equals(a.getName()) && cardnumber.equals(a.getCardNumber()))
            {
                System.out.println("Login success");
                return 1;
            }
            
        }
        System.out.println("login Failed");
       return 0;
	}

	//============================================================
	public void ReadOrderStatus(){
		
		DeliveryStatusTime deliverystatustime= new DeliveryStatusTime();
		System.out.println("Order status:  " + deliverystatustime.ReadOrderStatus());
	}
	//====================================================================
	public void ReadOrderTime(){
		DeliveryStatusTime deliverystatustime= new DeliveryStatusTime();
		int temp= deliverystatustime.ReadOrderDeliveryTime();
		System.out.println("Approximate time to deliver the orders: " + temp + " minutes");
	}
	
	//===================================================================
	public void WriteReview(){
		
		 Review review= new  Review();
		 review.Review();
	}
	//========================================================================
	public void RequestAssistance(int x)
	
	{
		Administrator administrator= new Administrator();
		if(x==1)
		{
			administrator.AcceptFoodAssistanceRequest();
		}
		
		if(x==2)
		{
			administrator.AcceptBillingAssistanceRequest();
		}
		
	}
	
	
	
	
	
}
