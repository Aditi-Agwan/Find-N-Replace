package prac;
import java.awt.*;

import java.awt.event.*;

public class FindText extends Frame{
    FindText(){
    	 TextField tf1 , tf2;
    	 Label l1 , l2;
    	 
    	 l1 = new Label("Find : ");
    	 l1.setBounds(60,30,170,20);
         tf1 = new TextField();
         tf1.setBounds(60,50,170,20);
         tf1.setColumns(30);
         
         l2 = new Label("Replace : ");
         l2.setBounds(60,70,170,20);
         tf2 = new TextField();
         tf2.setBounds(60 , 90 , 170 , 20);
         tf2.setColumns(30);
         
         Button b = new Button("Replace");
         b.setBounds(100,120,80,30);
         
         add(b);
         add(l1);
         add(tf1);
         add(l2);
         add(tf2);
         setSize(500,500);
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
    
		FindText(int success){
        	 Label l = new Label();
        	 l.setBounds(60,160,170,20);
        	 if(success==1)
        		 l.setText("Record Updated successfully .");
        	 else
        		 l.setText("Record not found .");
        	 add(l);
        	 setSize(200,200);
        	 setVisible(true);
        		 
         }
        	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        new FindText();
	}

}
