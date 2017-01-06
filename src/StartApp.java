import javax.swing.*;
import java.awt.event.*;
public class StartApp{
	public static void main(String args[]){
		JFrame j=new JFrame("Start");
		JTextField t=new JTextField();
		t.setBounds(50, 50, 150, 20);
		JButton b=new JButton("click");
		b.setBounds(50,100,70,30);
		JLabel l=new JLabel();
		l.setBounds(50, 150, 100, 50);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
			 try{
				String host=t.getText();
				String ip=java.net.InetAddress.getByName(host).getHostAddress();
				l.setText(ip);
			 }catch(Exception ex)
			{System.out.println(ex);
			}
			}
		});
		j.add(l);
		j.add(t);
		j.add(b);
		j.setSize(500,500);
		j.setLayout(null);
		j.setVisible(true);
		
	}
}