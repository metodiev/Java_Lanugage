package __java_gui;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class SwingClass extends JFrame{
	
	public static void main(String[] args){
		
		new SwingClass();
		
	}
	
	public SwingClass(){
		
		this.setSize(400, 400);
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Tell");
		
		label1.setText("Label Text");
		
		label1.setToolTipText("Tip to text");
		//Swing Button
		JButton btn = new JButton("Print");
		/*btn.setBorderPainted(true);
		btn.setContentAreaFilled(false);*/
		//btn.setText("Btn Text");
		
		//Swing Text Field
		JTextField textField = new JTextField("Text Field", 20);
		
		textField.setColumns(10);
		textField.setText("Text");
		textField.setToolTipText("Field");
		
		//Swing TextArea
		
		JTextArea textArea = new JTextArea(20,20);
		
		textArea.setText("Text area text\n ");
		textArea.setLineWrap(false);
		textArea.setWrapStyleWord(true);
		
		int numnOfLines = textArea.getLineCount();
		textArea.append("number of lines" + numnOfLines);
	
		//SwingScrollPane
		
		JScrollPane scrollbar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		//to center Swing GUI
		this.setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
				
	   Dimension dim = tk.getScreenSize();
	   
	   int xPos = (dim.width /2 ) - (this.getWidth() / 2);
	   int yPos = (dim.height /2 ) - (this.getHeight() / 2);
	   
	   this.setLocation(xPos, yPos);
	   
    this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Swing Title");
	
	//Add components to the panel
	panel.add(btn);
	panel.add(label1);
	panel.add(textField);
	panel.add(textArea);
	panel.add(scrollbar);
	//Add to the container components like panel
	this.add(panel);
	//this.add(label1);
	
	this.setVisible(true);
	textField.requestFocus();
	
	
	
		
	}

}
