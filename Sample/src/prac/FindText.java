package prac;
import java.awt.*;
import java.awt.event.*;

public class FindText extends Frame{
    FindText(){
    	 TextField tf1 , tf2;
         tf1 = new TextField();
         tf1.setBounds(60,50,170,20);
         
         tf2 = new TextField();
         tf2.setBounds(60 , 70 , 170 , 20);
         
         Button b = new Button("Replace");
         b.setBounds(100,120,80,30);
         add(b);
         add(tf1);
         add(tf2);
         setSize(300,300);
         setLayout(null);
         setVisible(true);
         b.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		String find = tf1.getText();
         		String replace = tf2.getText();
         		String args[] = {find , replace};
                Demo.main(args);
               }
         });
          
        	}    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        new FindText();
	}

}
