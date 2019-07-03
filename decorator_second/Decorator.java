package decorator_second;

import java.awt.BorderLayout;

import javax.swing.JComponent;

public class Decorator extends JComponent {
		  public Decorator( JComponent c){
			  setLayout(new BorderLayout());
			  add(c);
			  
			  
		  }
}
