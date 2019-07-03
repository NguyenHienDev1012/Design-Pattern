package view;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculationView extends JFrame {

	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
 	private JTextField secondNumber = new JTextField(10);
 	private JButton calculateButon = new JButton("Calculate");
 	private JTextField calculateSolution = new JTextField(10);
 	
 	
 	public CalculationView() {
 		JPanel calculationPanel = new JPanel();
 		this.add(calculationPanel);
 		
 		calculationPanel.add(firstNumber);
 		calculationPanel.add(additionLabel);
 		calculationPanel.add(secondNumber);
 		calculationPanel.add(calculateButon);
 		calculationPanel.add(calculateSolution);
 		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 		this.setSize(600, 200);
	}
 	
 	public int getFirstNumber() {
 		return Integer.parseInt(firstNumber.getText());
 	}
 	
 	public int getSecondNumber() {
 		return Integer.parseInt(secondNumber.getText());
 	}
 	
 	public int getCalculateSolution() {
 		return Integer.parseInt(calculateSolution.getText());
 	}
 	
 	public void setCalculateSolution(int solution) {
 		calculateSolution.setText(Integer.toString(solution));
 	}
 	
 	public void addCalculationListener(ActionListener listenForCalcButton) {
 		calculateButon.addActionListener(listenForCalcButton);
 	}
 	
 	public void displayErrorMessage(String errorMessage) {
 		JOptionPane.showMessageDialog(this, errorMessage);
 	}
			
}
