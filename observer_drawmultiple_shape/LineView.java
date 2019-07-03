package observer_drawmultiple_shape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class LineView   extends MyFrame implements Observer {
	Observable observable ;
	DrawingPanel pDrawing;
	public LineView(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
		setTitle("Line Observer");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Shape){
			 Shape s =(Shape)o;
			 add(pDrawing=new DrawingPanel(DrawingPanel.LINE, s.x1, s.y1, s.x2, s.y2)
			 ,BorderLayout.CENTER);
		}
		pDrawing.setBackground(Color.white);
		pDrawing.revalidate();
	}
	

}
