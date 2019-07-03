package decorator_third;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class ButtonDecorator extends AbstractButton {
	protected AbstractButton abs;
	
	public ButtonDecorator(AbstractButton a){
		this.abs=a;
		  add(abs);
	}

}
