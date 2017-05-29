package restro;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "AdministratorDetails")

public class EmployeeLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SerialNo")    
	   private int id;
	private String UserName, Password;

public EmployeeLogin(String username, String password) {
        
        UserName = username;
      Password = password;
    }
public EmployeeLogin() {
    
    UserName = null;
  Password = null;
}


	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}
//=======================Enters logins to the database=============================
	
	public void EnterLogininDatabase(String name, String password)
	{ 
//			
		
//		EmployeeLogin AdminLogin=new EmployeeLogin("Restro_Admin","Restro_Admin"); 
//        EmployeeLogin ChefLogin=new EmployeeLogin("Restro_Chef","Restro_Chef");
		
//        setUserName(name);  // data base values
//        setPassword(password);
//		setUserName("Chef");
//		setPassword("Chef");
	
	}
	
	

	public int  VerifyLogin(List<EmployeeLogin> loginlist, String UserName, String Password)
	{
	
		
        for(EmployeeLogin a:loginlist )
            
        {
            if(UserName.equals(a.getUserName()) && Password.equals(a.getPassword()))
            {
                System.out.println("Login success");
                return 1;
            }
            
        }
        System.out.println("login Failed");
       return 0;
	}

		
	

	private List<EmployeeLogin> getUserNameFromSQL() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
