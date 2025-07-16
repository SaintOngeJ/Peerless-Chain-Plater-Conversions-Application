/**
 * Class: PlaterGUI
 * Author: Wyatt St. Onge
 * Date: 7/21/2024
 * Purpose: This class contains the methods that draw the plater conversions
 * 			user interface.
 * Inputs:
 * 		- solSelect
 * 		- txtTitrationValue
 * 		- txtFillHt
 * Outputs:
 * 		- solArea1
 * 		- solAreaGal1
 * 		- solAreaMil1
 * 		- solAreaIn1
 * 		- solArea2
 * 		- solAreaGal2
 * 		- solAreaMil2
 * 		- solAreaIn2
 * Required Packages:
 * 		- javax.swing.*
 * 		- java.awt.*
 * 		- java.awt.event.ActionEvent
 * Input/Output Screen Formats: This application runs in a GUI window on
 * 								Windows OS.
 */

package PlaterConversions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlaterGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Plater plater;
	private PlaterCalculations platerCalc;
	private JLabel lblSolution;
	private static JComboBox<String> solSelect;
	private JLabel lblTitrationValue;
	private JTextField txtTitrationValue;
	private static JTextArea lblTitrationUnits;
	private JLabel lblFillHt;
	private JTextField txtFillHt;
	private JButton btnConvert;
	private JLabel lblFillInfo;
	private JLabel lblGallons;
	private JLabel lblMilliliters;
	private JLabel lblInches;
	private JTextArea solArea1;
	private JTextArea solAreaGal1;
	private JTextArea solAreaMil1;
	private JTextArea solAreaIn1;
	private JTextArea solArea2;
	private JTextArea solAreaGal2;
	private JTextArea solAreaMil2;
	private JTextArea solAreaIn2;
	private JPanel inputPanel, inputPanel2, infoPanel;
	
	/**
	 * Constructor that builds the GUI
	 */
	public PlaterGUI() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Tank Fill Calculation");
		
		inputPanel = new JPanel();
		inputPanel.setLayout(new FlowLayout());
		
		inputPanel2 = new JPanel();
		inputPanel2.setLayout(new FlowLayout());
		
		infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(3, 4));
		
		lblSolution = new JLabel("What are you filling?");
		String[] platingSolution = new String[] {"NaOH - Plating",
				"NaOH - Generator", "BroCo", "HCl", "Tri-Blue"};
		solSelect = new JComboBox<String>(platingSolution); 
		solSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soluIndex = solSelect.getSelectedIndex();
				final int naOHPlating = 0;
		        final int naOHGenerator = 1;
		        final int broCo = 2;
		        final int hCL = 3;
		        final int triBlue = 4;
				if (soluIndex == naOHPlating || soluIndex == naOHGenerator) {
					lblTitrationUnits.setText("oz./gal.");
				}  else if (soluIndex == broCo || soluIndex == hCL
						|| soluIndex == triBlue) {
					lblTitrationUnits.setText("%");
				}
			}
		});
		
		lblTitrationValue = new JLabel("Titration Value");
		txtTitrationValue = new JTextField(12);
		
		lblTitrationUnits = new JTextArea(1, 4);
		lblTitrationUnits.setEditable(false);
		lblTitrationUnits.setText("oz./gal.");
		
		lblFillHt = new JLabel("Fill Height (Inches)");
		txtFillHt = new JTextField(12);
		
		btnConvert = new JButton("Convert");
		
		lblFillInfo = new JLabel("Fill Information");
		lblGallons = new JLabel("Gallons");
		lblMilliliters = new JLabel("Milliliters");
		lblInches = new JLabel("Inches");
		
		solArea1 = new JTextArea(1, 5);
		solArea1.setEditable(false);
		
		solAreaGal1 = new JTextArea(1, 5);
		solAreaGal1.setEditable(false);
		
		solAreaMil1 = new JTextArea(1, 5);
		solAreaMil1.setEditable(false);
		
		solAreaIn1 = new JTextArea(1, 5);
		solAreaIn1.setEditable(false);
		
		solArea2 = new JTextArea(1, 5);
		solArea2.setEditable(false);
		
		solAreaGal2 = new JTextArea(1, 5);
		solAreaGal2.setEditable(false);
		
		solAreaMil2 = new JTextArea(1, 5);
		solAreaMil2.setEditable(false);
		
		solAreaIn2 = new JTextArea(1, 5);
		solAreaIn2.setEditable(false);
		
		Font font = new Font("Calibri", Font.PLAIN, 20);
		lblSolution.setFont(font);
		solSelect.setFont(font);
		lblTitrationValue.setFont(font);
		txtTitrationValue.setFont(font);
		lblTitrationUnits.setFont(font);
		lblFillHt.setFont(font);
		txtFillHt.setFont(font);
		btnConvert.setFont(font);
		lblFillInfo.setFont(font);
		lblGallons.setFont(font);
		lblMilliliters.setFont(font);
		lblInches.setFont(font);
		solArea1.setFont(font);
		solAreaGal1.setFont(font);
		solAreaMil1.setFont(font);
		solAreaIn1.setFont(font);
		solArea2.setFont(font);
		solAreaGal2.setFont(font);
		solAreaMil2.setFont(font);
		solAreaIn2.setFont(font);
		
		btnConvert.addActionListener(this::convertBtn);
		
		addComponentsToFrame();
		
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(inputPanel, BorderLayout.NORTH);
        frame.getContentPane().add(inputPanel2, BorderLayout.CENTER);
        frame.getContentPane().add(infoPanel, BorderLayout.SOUTH);
        frame.setSize(800, 220);
        frame.setMaximumSize(new Dimension(800, 220));
        frame.setVisible(true);
	}
	
	/**
	 * Adds the components to the frame
	 */
	public void addComponentsToFrame() {
		inputPanel.add(lblSolution);
		inputPanel.add(solSelect);
		inputPanel.add(lblTitrationValue);
		inputPanel.add(txtTitrationValue);
		inputPanel.add(lblTitrationUnits);
		
		inputPanel2.add(lblFillHt);
		inputPanel2.add(txtFillHt);
		inputPanel2.add(btnConvert);
		
		infoPanel.add(lblFillInfo);
		infoPanel.add(lblGallons);
		infoPanel.add(lblMilliliters);
		infoPanel.add(lblInches);
		infoPanel.add(solArea1);
		infoPanel.add(solAreaGal1);
		infoPanel.add(solAreaMil1);
		infoPanel.add(solAreaIn1);
		infoPanel.add(solArea2);
		infoPanel.add(solAreaGal2);
		infoPanel.add(solAreaMil2);
		infoPanel.add(solAreaIn2);
	}
	
	/**
	 * Fills the information of NaOHPlat values on the form
	 */
	public void NaOHPlatInfo() {
		try {
            plater.setNaOHPlat(Float.parseFloat
            		(txtTitrationValue.getText()));
            plater.setFillHt(Float.parseFloat(txtFillHt.getText()));
            solArea1.setText("NaOH Plating - Fill");
            solArea2.setText("H2O Plating - Fill");
            solAreaGal1.setText(String.format("%.2f",
            		platerCalc.naOHPlatGal()));
            solAreaGal2.setText(String.format("%.2f",
            		platerCalc.h2OPlatGal()));
            solAreaMil1.setText(String.format("%.2f",
            		platerCalc.naOHPlatmL()));
            solAreaMil2.setText(String.format("%.2f",
            		platerCalc.h2OPlatmL()));
            solAreaIn1.setText(String.format("%.2f",
            		platerCalc.naOHPlatIn()));
            solAreaIn2.setText(String.format("%.2f",
            		platerCalc.h2OPlatIn()));
		 } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                		"Invalid input. Please enter a number.",
                		"Error", JOptionPane.ERROR_MESSAGE);
         }
	}
	
	/**
	 * Fills the information of NaOHGen values on the form
	 */
	public void NaOHGenInfo() {
		try {
			plater.setNaOHGen(Float.parseFloat
            		(txtTitrationValue.getText()));
            plater.setFillHt(Float.parseFloat(txtFillHt.getText()));
            solArea1.setText("NaOH Generator - Fill");
            solArea2.setText("H2O Generator - Fill");
            solAreaGal1.setText(String.format("%.2f",
            		platerCalc.naOHGenGal()));
            solAreaMil1.setText(String.format("%.2f",
            		platerCalc.naOHGenmL()));
            solAreaIn1.setText(String.format("%.2f",
            		platerCalc.naOHGenIn()));
            solAreaGal2.setText(String.format("%.2f",
            		platerCalc.h2OGenGal()));
            solAreaMil2.setText(String.format("%.2f",
            		platerCalc.h2OGenmL()));
            solAreaIn2.setText(String.format("%.2f",
            		platerCalc.h2OGenIn()));
		 } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                		"Invalid input. Please enter a number.",
                		"Error", JOptionPane.ERROR_MESSAGE);
         }
	}
	
	/**
	 * Fills the information of BroCo values on the form
	 */
	public void BroCoInfo() {
		try {
			plater.setBroCo(Float.parseFloat
					(txtTitrationValue.getText()));
			plater.setFillHt(Float.parseFloat(txtFillHt.getText()));
			solArea1.setText("BroCo Fill");
			solArea2.setText("H2O Fill");
			solAreaGal1.setText(String.format("%.2f",
					platerCalc.broCoGal()));
			solAreaMil1.setText(String.format("%.2f",
					platerCalc.broComL()));
			solAreaIn1.setText(String.format("%.2f",
					platerCalc.broCoIn()));
			solAreaGal2.setText(String.format("%.2f",
					platerCalc.h2OBroGal()));
			solAreaMil2.setText(String.format("%.2f",
					platerCalc.h2OBromL()));
			solAreaIn2.setText(String.format("%.2f",
					platerCalc.h2OBroIn()));
		} catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
            		"Invalid input. Please enter a number.",
            		"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Fills the information of HCl values on the form
	 */
	public void HClInfo() {
		try {
			plater.setHCl(Float.parseFloat
					(txtTitrationValue.getText()));
			plater.setFillHt(Float.parseFloat(txtFillHt.getText()));
			solArea1.setText("HCl");
			solArea2.setText("H2O");
			solAreaGal1.setText(String.format("%.2f",
					platerCalc.hClGal()));
			solAreaMil1.setText(String.format("%.2f",
					platerCalc.hClmL()));
			solAreaIn1.setText(String.format("%.2f",
					platerCalc.hClIn()));
			solAreaGal2.setText(String.format("%.2f",
					platerCalc.h2OHClGal()));
			solAreaMil1.setText(String.format("%.2f",
					platerCalc.h2OHClmL()));
			solAreaIn2.setText(String.format("%.2f",
					platerCalc.h2OHClIn()));
		} catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
            		"Invalid input. Please enter a number.",
            		"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Fills the information of Tri-Blue values on the form
	 */
	public void TriBlueInfo() {
		try {
			plater.setHCl(Float.parseFloat
					(txtTitrationValue.getText()));
			plater.setFillHt(Float.parseFloat(txtFillHt.getText()));
			solArea1.setText("Tri-Blue");
			solArea2.setText("H2O");
			solAreaGal1.setText(String.format("%.2f",
					platerCalc.triBlueGal()));
			solAreaMil1.setText(String.format("%.2f",
					platerCalc.triBluemL()));
			solAreaIn1.setText(String.format("%.2f",
					platerCalc.triBlueIn()));
			solAreaGal2.setText(String.format("%.2f",
					platerCalc.h2OTriBlueGal()));
			solAreaMil2.setText(String.format("%.2f",
					platerCalc.h2OTriBluemL()));
			solAreaIn2.setText(String.format("%.2f",
					platerCalc.h2OTriBlueIn()));
		} catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
            		"Invalid input. Please enter a number.",
            		"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Updates the GUI with calculations from user inputed values
	 * @param e
	 */
	private void convertBtn(ActionEvent e) {
		if (e.getSource() == btnConvert) {
			int soluIndex = solSelect.getSelectedIndex();
			plater = new Plater(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
	        platerCalc = new PlaterCalculations(plater);
	        final int naOHPlating = 0;
	        final int naOHGenerator = 1;
	        final int broCo = 2;
	        final int hCL = 3;
	        final int triBlue = 4;
			switch (soluIndex) {
				case naOHPlating:
					NaOHPlatInfo();
			        break;
				case naOHGenerator:
					NaOHGenInfo();
			        break;
				case broCo:
					BroCoInfo();
					break;
				case hCL:
					HClInfo();
					break;
				case triBlue:
					TriBlueInfo();
					break;
			}
		}
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new PlaterGUI();
			});
	}

}
