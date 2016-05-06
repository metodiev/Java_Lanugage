package __java_gui;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.*;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class SwingChangeListener extends JFrame {

	JButton btn;
	JLabel label1, label2, label3;
	JTextField textFiled1, textField2;
	JCheckBox dollarSign, commaSeparator;
	JRadioButton addNums, substract, multiNums, divideNumbers;
	JSlider howManyTime;
	double number1, number2, totalCalc;

	public static void main(String[] args) {

		new SwingChangeListener();

	}

	public SwingChangeListener() {

		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("My Third Frame");

		JPanel panel = new JPanel();
		btn = new JButton("Calculate");
		ListenForButton lForButton = new ListenForButton();
		btn.addActionListener(lForButton);
		label1 = new JLabel("Number 1");
		textFiled1 = new JTextField("", 5);

		label2 = new JLabel("Number 2");
		textField2 = new JTextField("", 5);

		// Add CheckBox
		dollarSign = new JCheckBox("Dollars");
		commaSeparator = new JCheckBox("Commas");

		// Add RadioButton

		addNums = new JRadioButton("Add");
		substract = new JRadioButton("Substract");
		divideNumbers = new JRadioButton("Divide");
		multiNums = new JRadioButton("Multiply");

		ButtonGroup operation = new ButtonGroup();
		operation.add(addNums);
		operation.add(substract);
		operation.add(divideNumbers);
		operation.add(multiNums);

		JPanel operPanel = new JPanel();
		Border operBorder = BorderFactory.createTitledBorder("Operation");
		operPanel.setBorder(operBorder);

		operPanel.add(addNums);
		operPanel.add(substract);
		operPanel.add(divideNumbers);
		operPanel.add(multiNums);

		label3 = new JLabel("Perform How many Times");

		// SLider

		howManyTime = new JSlider(0, 99, 1);
		howManyTime.setMinorTickSpacing(1);
		howManyTime.setMinorTickSpacing(10);

		howManyTime.setPaintTicks(true);
		howManyTime.setPaintLabels(true);

		ListenForSlider lForSlider = new ListenForSlider();

		// Tell Java that you want to be alerted when an event

		// occurs on the slider

		howManyTime.addChangeListener(lForSlider);
		panel.add(howManyTime);
		panel.add(label3);
		panel.add(textFiled1);
		panel.add(label1);
		panel.add(textField2);
		panel.add(label2);
		panel.add(btn);
		panel.add(dollarSign);
		panel.add(commaSeparator, true);
		panel.add(operPanel);
		this.add(panel);
		this.setVisible(true);

		textFiled1.requestFocus();

	}

	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn) {
				try {
					number1 = Double.parseDouble(textFiled1.getText());
					number2 = Double.parseDouble(textField2.getText());
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(SwingChangeListener.this, "Please Enter the Right Info", "Error",
							JOptionPane.ERROR_MESSAGE);

					System.exit(0);
				}
				  if(addNums.isSelected()) { totalCalc = addNumbers(number1, number2, howManyTime.getValue());
			         } else if(substract.isSelected()) { totalCalc = subtractNumbers(number1, number2, howManyTime.getValue());
			         } else if(multiNums.isSelected()) { totalCalc = multiplyNumbers(number1, number2, howManyTime.getValue());
			         } else { totalCalc = divideNumbers(number1, number2, howManyTime.getValue()); }

			         // If the dollar is selected in the checkbox print the number as currency 

			         if(dollarSign.isSelected()) {
			             // Defines that you want to format a number with $ and commas
			             NumberFormat numFormat = NumberFormat.getCurrencyInstance();
			             JOptionPane.showMessageDialog(SwingChangeListener.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
			         }

			         // If the comma is selected in the checkbox print the number with commas
			         else if(commaSeparator.isSelected()) {

			             // Defines that you want to format a number with commas
			             NumberFormat numFormat = NumberFormat.getNumberInstance();
			             JOptionPane.showMessageDialog(SwingChangeListener.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
			         } else {
			         JOptionPane.showMessageDialog(SwingChangeListener.this, totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
			         }
			     }
			}
		}


	private class ListenForSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if (e.getSource() == howManyTime) {
				label3.setText("How many time get the value " + howManyTime.getValue());
			}

		}

	}

	public static double addNumbers(double number1, double number2, int howMany) {
		double total = 0;
		int i = 1;
		while (i <= howMany) {
			total = total + (number1 + number2);
			i++;
		}
		return total;
	}

	public static double subtractNumbers(double number1, double number2, int howMany) {

		double total = 0;
		int i = 1;
		while (i <= howMany) {
			total = total + (number1 - number2);
			i++;
		}
		return total;
	}

	public static double multiplyNumbers(double number1, double number2, int howMany) {
		double total = 0;
		int i = 1;
		while (i <= howMany) {
			total = total + (number1 * number2);
			i++;
		}
		return total;
	}

	public static double divideNumbers(double number1, double number2, int howMany){
		double total = 0;
		int i = 1;
		while(i <= howMany){
			total = total + (number1 / number2);
			i++;
		}
		return total;
	}

	}
