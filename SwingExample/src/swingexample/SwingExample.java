package swingexample;
import javax.swing.*;
import java.awt.event.*;
/* @author ultimatehackers & Ajay388
 */
public class SwingExample extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public SwingExample(){}
    public SwingExample(String s){
	super(s);
    }
    public void setComponents(){
        l1=new JLabel("Addition Of Two Numbers");
        l2=new JLabel("First Number");
        l3=new JLabel("Second Number");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("ADD");
        setLayout(null);
        l1.setBounds(50,50,200,20);	
        l2.setBounds(35,90,100,20);	
        t1.setBounds(180,90,100,20);	
        l3.setBounds(35,120,100,20);	
        t2.setBounds(180,120,100,20);	
        b1.setBounds(100,150,100,20);
        l4.setBounds(35,210,100,20);
        b1.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);	
    }
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int s = a+b;
            l4.setText("Result Is "+s);
        }
    }
    public static void main(String[] args) {
        SwingExample jf = new SwingExample("Addition Application");
            jf.setComponents();
            jf.setSize(300,300);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
