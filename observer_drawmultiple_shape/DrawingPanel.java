package observer_drawmultiple_shape;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private int x1, y1, x2, y2;
	private int type;

	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int OVAL = 3;

	public DrawingPanel(int type,int x1, int y1,int  x2, int y2){
		this.type=type;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.GREEN);
		super.paintComponent(g);
		switch (type) {
		case LINE:
			g.drawLine(x1, y1, x2, y2);

			break;

		case 2:
			g.fillRect(x1, y1, x2, y2);

			break;

		case 3:
			g.fillOval(x1, y1, x2, y2);
			break;

		}
	}

}
