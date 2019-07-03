package observer_drawmultiple_shape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class OvalView  extends MyFrame  implements Observer {
	Observable observale;
	DrawingPanel pDrawing;

	public OvalView(Observable observale) {
		this.observale = observale;
		observale.addObserver(this);
		setTitle("Oval Observer");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Shape) {
			Shape s=(Shape)o;
			add(pDrawing=new DrawingPanel(DrawingPanel.OVAL, s.x1, s.y1,s. x2, s.y2)
			,BorderLayout.CENTER
			);
			pDrawing.setBackground(Color.white);
			pDrawing.revalidate();
		}
	}

}
