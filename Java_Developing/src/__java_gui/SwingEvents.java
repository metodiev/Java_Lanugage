package __java_gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEvents extends JFrame{

	JButton btn;
	JTextField textField;
	JTextArea textArea;
	int btnClicked;
	
	public static void main(String[] args) {
		new SwingEvents();
	}

	public SwingEvents(){
		this.setSize(500, 500);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Swing events");
		
		JPanel panel = new JPanel();
		btn = new JButton("Click Here");
		
		//Set listner for button
		
		ListenForButton lForButton = new ListenForButton();
		btn.addActionListener(lForButton);
		
		//Set listener for keys
		textField = new JTextField("Textfilled", 20);
		ListenForKeys  lForKeys = new ListenForKeys();
		
		textField.addKeyListener(lForKeys);
				
				
		textArea = new JTextArea(20,20);
		textArea.setText("Tracking Events\n");
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JScrollPane scrollbar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		panel.add(scrollbar);
		panel.add(btn);
		panel.add(textField);
		this.add(panel);
		//Window Listener
		ListenForWindow lForWindow = new ListenForWindow();
		this.addWindowListener(lForWindow);
		
		//Mouse Listener
		ListenForMouse lForMouse = new ListenForMouse();
		this.addMouseListener(lForMouse);
		this.setVisible(true);
	}
	
	//Implement Listener
	
	//Listener Class for button
	private class ListenForButton implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btn){
				btnClicked++;
				textArea.append("Button clicked " + btnClicked + "times \n");
				
				//e.getSource().toString()
			}
		}
	}
	
	//Listener Class for Keys
	private class ListenForKeys implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			textArea.append("Key Hit: " + e.getKeyChar() + "\n");
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	//Listener Class for Window
	private class ListenForWindow implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			textArea.append("Window is active ");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ListenForMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea.append("Mouse point" + e.getX() + e.getY());
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
}



