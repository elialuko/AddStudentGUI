package student;
import java.util.*;

import java.awt.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;

//import week3.AddStudentGUI;
	
public class AddStudentGUI extends JFrame {
	private static final Object FlowLayout = null;
	String userInput;
	ArrayList<String> list= new ArrayList<>();
	public AddStudentGUI(){
		super("Student Information System");
	JFrame frame = this;
	setTitle("Student Information System");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(300, 300));
	JPanel panel= new JPanel();
	String title = "New Student";
	Border border = BorderFactory.createTitledBorder(title);
	panel.setBorder(border);
	//panel.setBackground(Color.white);
	panel.setPreferredSize(new Dimension(100,100));
	panel.setLayout(new FlowLayout());
	
	frame.getContentPane().add(panel, BorderLayout.NORTH);
	
	
	JPanel panel3= new JPanel();
	String title2 = "Buttons";
	Border border2 = BorderFactory.createTitledBorder(title2);
	panel3.setBorder(border2);
	//panel3.setBackground(Color.white);
	panel3.setPreferredSize(new Dimension(100,100));
	panel3.setLayout(new FlowLayout());
	frame.getContentPane().add(panel3, BorderLayout.SOUTH);
	
	JButton button = new JButton("Finish");
	panel3.add(button);
	JButton button2 = new JButton("Clear All");
	panel3.add(button2);
	
	button.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e)
	    {
	       frame.dispose();
	    }
	});
	
	JPanel panel4= new JPanel();
	String title3 = "Modules";
	Border border3 = BorderFactory.createTitledBorder(title3);
	panel4.setBorder(border3);
	//panel4.setBackground(Color.white);
	panel4.setPreferredSize(new Dimension(150,100));
	panel4.setLayout(new FlowLayout());
	frame.getContentPane().add(panel4, BorderLayout.EAST);
	JCheckBox checkBox = new JCheckBox("Databases");
	panel4.add(checkBox);
	JCheckBox checkBox2 = new JCheckBox(" Java   ");
	panel4.add(checkBox2);
	JCheckBox checkBox3 = new JCheckBox("Accountancy");
	panel4.add(checkBox3);
	JTextArea area2 = new JTextArea();
	area2.setPreferredSize(new Dimension(125,330));
	area2.setEditable(false);
	area2.setVisible(true);
	panel4.add(area2);
	checkBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	    {
			if(checkBox.isSelected()) 
				area2.append("Databases" +"\n");
			else
				area2.setText(" ");
	    }
	    
	});
	checkBox2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	    {
			if(checkBox2.isSelected()) 
				area2.append("Java"+"\n");
			else
				area2.setText(" ");
	    }
	});
	checkBox3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	    {
			if(checkBox3.isSelected()) 
				area2.append("Accountancy" + "\n");
			else
				area2.setText(" ");
	    }
	});
	
	frame.pack();
	frame.setVisible(true);
	
	JLabel label = new JLabel("Name");
	JPanel panel2 = new JPanel();
	JTextField field = new JTextField("Peter Smith");
	//panel.add(panel2, FlowLayout);
	//frame.getContentPane().add(panel2);
	
	JLabel label2 = new JLabel("Address");
	
	JTextField field2=new JTextField("35 Liffey Street, Dublin2");
	JButton button3 = new JButton("Submit");
	JButton button4 = new JButton("Clear");
	panel.add(label);
	panel.add(field);
	panel.add(label2);
	panel.add(field2);
	panel.add(button3);
	panel.add(button4);
	
	
	JPanel panel5= new JPanel();
	String title4="Show Student";
	Border border4 = BorderFactory.createTitledBorder(title4);
	panel5.setBorder(border4);
	panel5.setBackground(Color.white);
	panel5.setPreferredSize(new Dimension(100,100));
	panel5.setLayout(new FlowLayout());
	frame.getContentPane().add(panel5, BorderLayout.CENTER);
	JTextArea area = new JTextArea();
	//area.setPreferredSize(new Dimension(100, 100));
	area.setEditable(false);
	area.setVisible(true);
	panel5.add(area);
	
	button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	    {
			userInput= field.getText()+ " " + field2.getText();
			if(e.getSource()==button3) 
				list.add(userInput);
				area.append(userInput+"\n");
			
	    }});
	button4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	    {
			if(e.getSource()==button3) 
				list.clear();
			area.setText("");
			
	    }});
	
	button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	    {
			if(e.getSource()==button3) 
				list.clear();
			area.setText("");
			area2.setText(" ");
			field.setText("Peter Smith");
			field2.setText("35 Liffey Street, Dublin2");
			checkBox.setSelected(false);
			checkBox2.setSelected(false);
			checkBox3.setSelected(false);
	    }});
	
	}
	public static void main(String[] args){
		AddStudentGUI act= new AddStudentGUI();
		act.pack();
		act.setVisible(true);
	}
}

