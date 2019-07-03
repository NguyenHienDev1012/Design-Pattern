package decorator_third;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.AbstractButton;
import javax.swing.JComponent;


public class SlashButton extends ButtonDecorator{


	public SlashButton(AbstractButton a) {
		super(a);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.drawLine(0, 0, getWidth(),getHeight());
		repaint();
	}
}
