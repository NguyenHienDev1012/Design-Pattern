package controlller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculatorModel;
import view.CalculationView;

public class CalculatorController {

	private CalculationView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculationView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				theView.setCalculateSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("You need to enter 2 Integer number");
			}
		}
		
	}
}
