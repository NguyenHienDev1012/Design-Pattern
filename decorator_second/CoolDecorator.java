package decorator_second;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class CoolDecorator extends Decorator {
	private boolean mouse_over; 
	private JComponent thisComp;

	public CoolDecorator(JComponent c) {
		super(c);
		mouse_over = false;
		thisComp = this; 
		c.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				mouse_over = true; 
				thisComp.repaint();
			}

			public void mouseExited(MouseEvent e) {
				mouse_over = false; 
				thisComp.repaint();
			}
		});
	}

	// paint the button
	public void paint(Graphics g) {
		super.paint(g); 
		if (!mouse_over) {
			Dimension size = super.getSize();
			g.setColor(Color.GREEN);
			g.drawRect(0, 0, size.width - 1, size.height - 1);
			g.drawLine(size.width - 2, 0, size.width - 2, size.height - 1);
			g.drawLine(0, size.height - 2, size.width - 2, size.height - 2);
		}
	}
}