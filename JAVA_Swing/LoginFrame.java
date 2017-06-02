package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import restro.Driver;

public class LoginFrame implements ActionListener{

	private static JFrame jframeLogin,jframeTimeStatus;
	private static JPanel jpanelLogin , jpanelLogin1, jpanelLogin2;
	private static JButton jchefLogin , jadminLogin, login ;
	private static JLabel jusername, jpassword;
	private static JTextArea jpasswordEnter , jusernameEnter  ;
	
	

LoginFrame()
{
	//================================ the employee login page=========================
	jframeLogin = new JFrame("Employee Login");
		jpanelLogin = new JPanel(new GridLayout(2,1));
		
		jchefLogin = new JButton ("Chef Login");
		jadminLogin = new JButton ("Admin Login");
		jpanelLogin.add(jchefLogin);
		jpanelLogin.add(jadminLogin);
		jframeLogin.add(jpanelLogin,BorderLayout.NORTH);	
	jframeLogin.setVisible(true);
	 jframeLogin.setSize(300, 200);

	 jchefLogin.addActionListener(this); 
		jadminLogin.addActionListener(this);
		
		//============================= the user name passwrod page=========================
		
		
		jframeLogin = new JFrame("Enter detils");
		jpanelLogin = new JPanel(new GridLayout(2,1));
		jusername = new JLabel ("username");
		jusernameEnter =  new JTextArea();
		jpanelLogin1 = new JPanel(new GridLayout(2,1));
		jpassword = new JLabel("password");
		jpasswordEnter = new JTextArea();
		jpanelLogin2 = new JPanel(new GridLayout(1,1));
		login =new JButton ("Login");
		
		jpanelLogin.add(jusername);
		jpanelLogin.add(jusernameEnter);
		jpanelLogin1.add(jpassword);
		jpanelLogin1.add(jpasswordEnter);
		jpanelLogin2.add(login);
		jframeLogin.add(jpanelLogin,BorderLayout.NORTH);
		jframeLogin.add(jpanelLogin1,BorderLayout.CENTER);		
		jframeLogin.add(jpanelLogin2,BorderLayout.SOUTH);
			
		jframeLogin.setVisible(false);
		jframeLogin.setSize(500, 200);
		
		
//==============================update Time Status============================
		jframeTimeStatus = new JFrame("Enter Time status");
		JPanel jpanelTimeStatus = new JPanel(new GridLayout(2,1));
		JLabel jTime = new JLabel ("Enter estimated time");
		JTextArea jTimeEnter =  new JTextArea();
		 JPanel jpanelTimeStatus1 = new JPanel(new GridLayout(2,1));
		JLabel jStatus = new JLabel("Enter Status");
		JTextArea jStatusEnter = new JTextArea();
		JPanel jpanelTimeStatus2 = new JPanel(new GridLayout(1,1));
		JButton submit =new JButton ("Submit");
		
		jpanelTimeStatus.add(jTime);
		jpanelTimeStatus.add(jTimeEnter);
		jpanelTimeStatus1.add(jStatus);
		jpanelTimeStatus1.add(jStatusEnter);
		jpanelTimeStatus2.add(submit);
		jframeTimeStatus.add(jpanelTimeStatus,BorderLayout.NORTH);
		jframeTimeStatus.add(jpanelTimeStatus1,BorderLayout.CENTER);		
		jframeTimeStatus.add(jpanelTimeStatus2,BorderLayout.SOUTH);
			
		jframeTimeStatus.setVisible(false);
		jframeTimeStatus.setSize(500, 200);
		
	 //I WANT THIS TO CLOSE WHEN I CLICK SUBMIT> NOT HAPENING======================
		
//========================action listner=======================
		jchefLogin.addActionListener(this); 
		jadminLogin.addActionListener(this);
		login.addActionListener(this);
		
}	
	
public static void LoginChef()
{
	jframeLogin.setVisible(true);
	}

public static void Loginadmin()
{
	jframeLogin.setVisible(true);
	}

public static void ModifyMenu()
{
	
	}
public static void UpdateTimeStatus()
{
	
	jframeTimeStatus.setVisible(true);
	}



@Override
public void actionPerformed(ActionEvent e) {
	Object o = e.getSource();
	try{
		if (o==jchefLogin)
			LoginChef();
		
		else if(o==jadminLogin)
			Loginadmin();
		
		else if(o==login)
			UpdateTimeStatus();
		
} catch(Exception ex)
	{
	System.out.println("error!!");
	}
}

}// class