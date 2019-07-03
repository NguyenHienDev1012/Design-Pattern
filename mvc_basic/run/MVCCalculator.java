package run;

import controlller.CalculatorController;
import model.CalculatorModel;
import view.CalculationView;

public class MVCCalculator {

	public static void main(String[] args) {
		CalculatorModel model = new CalculatorModel();
		CalculationView view = new CalculationView();
		CalculatorController controller = new CalculatorController(view, model);
		view.setVisible(true);
		view.setLocationRelativeTo(null);
	}
}
