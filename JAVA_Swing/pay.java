package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class pay implements ActionListener {
	private static JButton jPay;
	private static JFrame jframePay;
	private static JTextArea jTextPay;
	private int totalPrice;
	private static String paymentID;
	
	pay( int _totalPrice)
	{
		totalPrice= _totalPrice;
		
		
		jframePay = new JFrame("Make Payment");
		jframePay.setSize(300, 200);
		jframePay.setVisible(true);
  
   	 JPanel jpanelPay = new JPanel(new GridLayout(1,2));
   	 JLabel jlablePay = new JLabel("Total Bill:");
   	 jTextPay = new JTextArea();
   	jTextPay.setText(Integer.toString(totalPrice));
   	jTextPay.setEditable(false);
   	 jpanelPay.add(jlablePay);
   	 jpanelPay.add(jTextPay);
   	 
   	JPanel jpanelPay1 = new JPanel(new GridLayout(1,2));
   	 jPay= new JButton("Pay");
   	 jpanelPay1.add(jPay);
   	 
   	jframePay.add(jpanelPay,BorderLayout.NORTH);
   	 jframePay.add(jpanelPay1,BorderLayout.SOUTH);
   	 
   	jPay.addActionListener(this);
		
		//JOptionPane.showMessageDialog(null, totalPrice, "Cancel Order", 2);
	}
	
	public static void Pay()
	{	//=== Generating the OrderId===========================
		String baseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder saltString = new StringBuilder();
        Random random = new Random();
        while (saltString.length() < 10) {
            int index = (int) (random.nextFloat() * baseString.length());
            saltString.append(baseString.charAt(index));
        }
       // =====================================================
        paymentID = saltString.toString();
        
        JOptionPane.showMessageDialog(null,  paymentID, "Your Payment Id is ", 2);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		try{
			if (o == jPay)
				Pay();
			
			
			
		}catch(Exception ee)
		{
			System.out.println("error");
		}
		
	}
}
