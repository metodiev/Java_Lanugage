package __java_applets;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.FlowLayout;
import java.awt.event.*;


public class JavaApplets {
	JPanel panel;
	JPanel qPanel, q2Panel, q3Panel, q4Panel;
	JButton getResultBut;
	JRadioButton extravertRaio, introvertRadio,
		sensorRadio, intuitiveRadio, feelerRadio,
		thinkerRadio, judgingRadio, perceivingRadio;
	
	JEditorPane yourReport;
	
	public void init(){
		//this.setSize(675, 870);
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		qPanel = new JPanel();
		q2Panel = new JPanel();
		q3Panel = new JPanel();
		q4Panel = new JPanel();
		
		Border border1 = BorderFactory.createTitledBorder("Do you prefer to work");
		Border border2 = BorderFactory.createTitledBorder("Do you prefer to work");
		Border border3 = BorderFactory.createTitledBorder("Do you prefer to work");
		Border border4 = BorderFactory.createTitledBorder("Do you prefer to work");
		
		qPanel.setBorder(border1);
		q2Panel.setBorder(border2);
		q3Panel.setBorder(border3);
		q4Panel.setBorder(border4);
		
		ButtonGroup group1 = new ButtonGroup();
		ButtonGroup group2 = new ButtonGroup();
		ButtonGroup group3 = new ButtonGroup();
		ButtonGroup group4 = new ButtonGroup();
		
		extravertRaio = new JRadioButton("In groups");
		introvertRadio = new JRadioButton("In groups");
		sensorRadio = new JRadioButton("In groups");
		intuitiveRadio = new JRadioButton("In groups");
		feelerRadio = new JRadioButton("In groups");
		thinkerRadio = new JRadioButton("In groups");
		judgingRadio = new JRadioButton("In groups");
		perceivingRadio = new JRadioButton("In groups");
		
		extravertRaio.setSelected(true);
		sensorRadio.setSelected(true);
		feelerRadio.setSelected(true);
		judgingRadio.setSelected(true);
		
		qPanel.add(extravertRaio);
		qPanel.add(introvertRadio);
		q2Panel.add(sensorRadio);
		q2Panel.add(intuitiveRadio);
		q3Panel.add(feelerRadio);
		q3Panel.add(thinkerRadio);
		q4Panel.add(judgingRadio);
		q4Panel.add(perceivingRadio);
		
		
		group1.add(extravertRaio);
		group1.add(introvertRadio);
		group2.add(sensorRadio);
		group2.add(intuitiveRadio);
		group3.add(feelerRadio);
		group3.add(thinkerRadio);
		group4.add(judgingRadio);
		group4.add(perceivingRadio);
		
		panel.add(qPanel);
		panel.add(q2Panel);
		panel.add(q3Panel);
		panel.add(q4Panel);
		
		getResultBut = new JButton("Get Result");
		GetResultsListener butListener = new getResultsListener();
		
		getResultBut.addActionListener(butListener);
		
		panel.add(getResultBut);
		this.setVisible(true);
	
	}
	
	class GetResultsListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String pageToOpen = "",
					directoryLoc = "";
			String textToDisplay = "Some html document" + directoryLoc;
			
			if(e.getSource() == getResultBut){
				if(extravertRaio.isSelected()){
					pageToOpen += "E";
				}
			}
			
			
		}
		
	}
	
}
