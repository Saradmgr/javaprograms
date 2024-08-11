import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {

    public static void main(String args[]){
        JFrame f=new JFrame("Calculator");
        f.setVisible(true);
        f.setSize(500,500);
        JTextField t1=new JTextField();
        f.add(t1);
        t1.setBounds(50,50,190,25);
        JTextField t2=new JTextField();
        f.add(t2);
        t2.setBounds(50,80,190,25);
        JButton b1=new JButton("Add");
        f.add(b1);
        b1.setBounds(50,115,80,25);
        JButton b2=new JButton("Subtraction");
        f.add(b2);
        b2.setBounds(140,115,130,25);
        JLabel l1=new JLabel();
        f.add(l1);
        l1.setBounds(50,140,80,25);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String int1=t1.getText();
                int num1=Integer.parseInt(int1);
                String int2=t2.getText();
                int num2=Integer.parseInt(int2);
                int sum=num1+num2;
                l1.setText(Integer.toString(sum)); 
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String int1=t1.getText();
                int num1=Integer.parseInt(int1);
                String int2=t2.getText();
                int num2=Integer.parseInt(int2);
                int sum=num1-num2;
                l1.setText(Integer.toString(sum));
            }
        });
    }
}