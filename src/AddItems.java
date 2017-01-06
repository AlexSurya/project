import javax.swing.*;
import java.awt.*;


public class AddItems extends JFrame {
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	AddItems(){
		JFrame f=new JFrame("Adding Items");
		l1=new JLabel("PRODUCT ID:");
		l1.setBounds(20,80,150,20);
		t1=new JTextField();
		t1.setBounds(140,80,100,20);//productid creation
		
		l2=new JLabel("PRODUCT NAME:");
		l2.setBounds(20,120,180,20);
		t2=new JTextField();
		t2.setBounds(140,120,100,20);//product name creation
		
		l3=new JLabel("MRP:");
		l3.setBounds(20,160,150,20);
		t3=new JTextField();
		t3.setBounds(140,160,100,20);//mrp creation
		
		b1=new JButton("SUBMIT");
		b1.setBounds(20,190,100,20);
		b2=new JButton("CANCEL");
		b2.setBounds(150,190,100,20);//submit and cancel button creation
		
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		
		
		this.setLayout(new FlowLayout());
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	public static void main(String args[]){
		AddItems a=new AddItems();
	}
	

}
