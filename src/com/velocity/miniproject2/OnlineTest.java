package com.velocity.miniproject2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class OnlineTest extends JFrame implements ActionListener {
	
	private static final long serialVersionUID= 1L;
	 JLabel label;
	 JRadioButton radioButton[]=new JRadioButton[5];
	 JButton btnNext,btnBookmark;
	 ButtonGroup bg;
	 int count=0,question=0,x=1,y=1, now=0;
	 int m[] =new int[10];
	 int j;
	 
	// create jframe with radioButton and jButton
   OnlineTest (String s) {
	   super(s);
	   label=new JLabel();
	   add (label);
	   bg=new ButtonGroup();
	   for(int i=0;i<5;i++) {
		   radioButton[i]=new JRadioButton();
		   add(radioButton[i]);
		   bg.add(radioButton[i]);
	   }
	   btnNext = new JButton("Next");
	   btnBookmark = new JButton("Bookmark");
	   btnNext.addActionListener(this);
	   btnBookmark.addActionListener(this);
	   add(btnNext);
	   add(btnBookmark);
	   set();
	   label.setBounds(30, 40, 450, 20);
	   // radioButton [0].setBounds950,80,200,20);
	   radioButton[0].setBounds(50, 80, 450, 20);
	   radioButton[1].setBounds(50, 110, 200, 20);
	   radioButton[2].setBounds(50, 140, 200, 20);
	   radioButton[3].setBounds(50, 170, 200, 20);
       btnNext.setBounds(100, 240, 100, 25);
       btnBookmark.setBounds(270,240, 100, 25);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);
       setLocation(250,100);
       setVisible(true);
       setSize(600,350);
       
   }
   
	// handle all actions based on event
   public void actionPerformed(ActionEvent e) {
	   if (e.getSource() == btnNext) {
		   if(check())
			   count = count * 1;
		      question ++;
		      set();
		      
		      if(question==9) {
		    	  btnNext.setEnabled(false);
		    	  btnBookmark.setText("Result");
		      }
	   }
	  if (e.getActionCommand().equals("Bookmark")) {
		  JButton bk = new JButton ("Bookmark"+x);
		  bk.setBounds(480,20 + 30 * x,100,30);
		  add(bk);
		  bk.addActionListener(this);
		  m[x] = question ;
		  x++;
		  question ++;
		  set();
		  if(question==9)
			  btnBookmark.setText("Result");
		      setVisible(false);
		      setVisible(true);
		      }
	     for (int i=0,y=1;i<x;i++,y++) {
	    	 if(e.getActionCommand().equals("Bookmark"+y)) {
	    		 if(check())
	    			 count=count+1;
	    		 now = question;
	    		 question = m[y];
	    		 set();
	    		 ((JButton) e.getSource()).setEnabled(false);
	    		  question= now;
	    		  
	    	 }
	     }
	     if(e.getActionCommand().equals("result")) {
	    	 if((check()))
	    		 count =count+1;
	    	     question++;
	    	     JOptionPane.showMessageDialog(this,"Correct answers="+count);
	    	     System.exit(0);
	     }
   }
   // Set question with options
   
   void set() {
	   radioButton[4].setSelected(true);
	   
	   if(question == 0) {
		   label.setText("question 1: Which of the following is not introduced with java 8 ?");
		   radioButton[0].setText("Strem API");
		   radioButton[1].setText("Serialization"); 	
		   radioButton[2].setText("Spliterator");
		   radioButton[3].setText("Lamda Expression");
	   }
		   
	   if(question == 1) {
		   label.setText("question 2: Which features of java 7 aliows to not explicitly close to resorces?");
		   radioButton[0].setText("Try catch finnaly");
		   radioButton[1].setText("IOException"); 	
		   radioButton[2].setText("Autoclosable");
		   radioButton[3].setText("Streams");
	   }
	   if(question == 2) {
		   label.setText("question 3: SessionFactory is a thread-safe object. ?");
		   radioButton[0].setText(" True");
		   radioButton[1].setText("False"); 	
		  
	   }
	   if(question == 3) {
		   label.setText("question 4: Which is new method introduced in java 8 to iterate over a collection ?");
		   radioButton[0].setText("fo(String 1 : StringList)");
		   radioButton[1].setText("foreach(String 1 : String(List)"); 	
		   radioButton[2].setText("StringList.forEach()");
		   radioButton[3].setText("List.for()");
	   }
	   if(question == 4) {
		   label.setText("question 5 : what is the substitute of Rhino javascript engine i n java 8 ?");
		   radioButton[0].setText("Nashorn");
		   radioButton[1].setText("V8"); 	
		   radioButton[2].setText("Inscript");
		   radioButton[3].setText("Narcissus");
	   }
	   if(question == 5) {
		   label.setText("question 6: How to read Entire file in one line using java 8 ?");
		   radioButton[0].setText("Files.readAllLines()");
		   radioButton[1].setText("Files.read()"); 	
		   radioButton[2].setText("Files.readFile()");
		   radioButton[3].setText("Files.lines()");
	   }
		         	         
	   if(question == 6) {
		   label.setText("question 7: which features of java 7 allows to not explicitly close IO resources ?");
		   radioButton[0].setText("try catch finally");
		   radioButton[1].setText("ioException"); 	
		   radioButton[2].setText("Autoclosable");
		   radioButton[3].setText("Streams");
	   }
	   if(question == 7) {
		   label.setText("question 8: which of the following is not a core interface of hibernate ?");
		   radioButton[0].setText("Configuratin");
		   radioButton[1].setText("Criteria"); 	
		   radioButton[2].setText("SessionManagement");
		   radioButton[3].setText("Session");
	   }
	   if(question == 8) {
		   label.setText("question 9:  SessionFactory is a thread-safe object ?");
		   radioButton[0].setText("True ");
		   radioButton[1].setText("False"); 	
		   radioButton[2].setText("Don't know");
		   radioButton[3].setText("false");
	   }
	   if(question == 9) {
		   label.setText("question 10:  Which of the following is not a state of object in Hibernate ?");
		   radioButton[0].setText("Attached");
		   radioButton[1].setText("Detached"); 	
		   radioButton[2].setText("persistent");
		   radioButton[3].setText("Transient");
	   }
	   label.setBounds(30,40,450,20);
	   for(int i=0,j=0; i<=90;i +=30,j++) 
		   radioButton[j].setBounds(50, 80+i,200 , 20);
   }
   
   
    // Declare a right answers
   
     boolean check() {
    	 if (question == 0)
    		 return ( radioButton[1].isSelected());
    	 if (question == 1)
    		 return ( radioButton[1].isSelected());
    	 if (question == 2)
    		 return ( radioButton[0].isSelected());
    	 if (question == 3)
    		 return ( radioButton[2].isSelected());
    	 if (question == 4)
    		 return ( radioButton[0].isSelected());
    	 if (question == 5)
    		 return ( radioButton[0].isSelected());
		   
    	 if (question == 6)
    		 return ( radioButton[1].isSelected());
		   
    	 if (question == 7)
    		 return ( radioButton[2].isSelected());
		   
    	 if (question == 8)
    		 return ( radioButton[0].isSelected());
		   
    	 if (question == 9)
    		 return ( radioButton[0].isSelected());
		   return false;    	 
     }	   
	   
	   	public static void main(String[] args) {
		 new OnlineTest("Online Test App");

	}

}
