import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employee extends JFrame implements ActionListener{


	JLabel lName,lAddr,lSalary,lfinal;
	JTextField tName,tAddr,tSalary;
	JRadioButton rd1,rd2,rd3;
	JButton bContinue,bExit;
	JFrame f;  
	ButtonGroup grp;    
	double salary;
	Container container=getContentPane();
	 
	Employee(){
		
		container.setLayout(null);
		
		lName=new JLabel("Name ");
		lAddr=new JLabel("Address");
		lSalary=new JLabel("Salary");
		lfinal=new JLabel();
		
		
		tName=new JTextField(15);
		tAddr=new JTextField(15);
		
		rd1=new JRadioButton("10,000");
		rd2=new JRadioButton("20,000");
		rd3=new JRadioButton("50,000");
		
		bContinue=new JButton("Continue");
		bExit=new JButton("Exit");
		
		grp=new ButtonGroup();
		grp.add(rd1);
		grp.add(rd2);
		grp.add(rd3);
		
		   //f.setLayout(new GridLayout(4,2));  
		   
		  lName.setBounds(50,150,100,30);  
		  lAddr.setBounds(50,220,100,30);
		  lSalary.setBounds(50,290,100,30);
		  
       tName.setBounds(150,150,150,30);
       tAddr.setBounds(150,220,150,30);
       
       rd1.setBounds(150,290,150,30);
       rd2.setBounds(150,320,150,30);
       rd3.setBounds(150,340,150,30);
       
       
       bContinue.setBounds(50,400,100,30);
       bExit.setBounds(200,400,100,30);
       
       
       lfinal.setBounds(50,500,500,30);

		 container.add(lName);
		  container.add(tName);
		  container.add(lAddr);
		  container.add(tAddr);
		  container.add(lSalary);
		  container.add(rd1);
		  container.add(rd2);
		  container.add(rd3);
		 container.add(bContinue);
		 container.add(bExit);
		 container.add(lfinal);
		
		
		
		bContinue.addActionListener(this);  
		bExit.addActionListener(this);  
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==bExit){
			System.exit(0);
		}
		if(rd1.isSelected()){
			salary=10000+(10000*130/100)+(10000*120/100)+2400;
			
		}
		else if(rd2.isSelected()){
			salary=20000+(20000*130/100)+(20000*120/100)+2400;
			
		}
		else if(rd3.isSelected()){
			salary=50000+(50000*130/100)+(50000*120/100)+2400;
			
		}
		lfinal.setText("Final Calculated Salary is :"+salary);
	
	}
	
	public static void main(String args[]){
	
		Employee frame=new Employee();
		frame.setTitle("Employee Form");
		frame.setVisible(true);
		frame.setBounds(10,10,370,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
