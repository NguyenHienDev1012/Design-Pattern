package decorator_third;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class CoolButton extends ButtonDecorator {
	public boolean mouse_over = false;

	public CoolButton(AbstractButton a) {
		super(a);
		abs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouse_over = true;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				mouse_over = false;
				repaint();
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		if (!mouse_over) {
			g.drawRect(0, 0, getWidth() - 2, getHeight() - 2);
			g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
			repaint();
		}

	}

}
