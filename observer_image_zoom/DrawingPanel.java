package observer_image_zoom;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel implements Observer {
	private int width;
	private int height;
	Observable observable;
	
	public DrawingPanel(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
		repaint();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Controlmage) {
			Controlmage controlImage = (Controlmage) o;
			width = controlImage.getWidth();
			height = controlImage.getHeight();
			repaint();
		}
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(User.controlImage.loadImage(), 100, 100, width, height,
				null);
	}

}
