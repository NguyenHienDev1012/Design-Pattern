package decorator_third;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

public class DecoButton extends ButtonDecorator {

	public DecoButton(AbstractButton a) {
		super(a);
		abs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}

}
