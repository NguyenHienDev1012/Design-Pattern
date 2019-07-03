package observer_image_zoom;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.print.Book;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class User extends JFrame {
	static Controlmage controlImage = new Controlmage();
	private int width = 200;
	private int height = 200;
	JLabel lbValueSlider = new JLabel();
	static JPanel pSlider = new JPanel();
	static JPanel pMain = new JPanel();
	private JSlider slider = new JSlider(JSlider.HORIZONTAL, 200, 1000, width);
	Observable observable;
	DrawingPanel drawing =new DrawingPanel(controlImage);

	public User(Observable observable) {
		setTitle("Image Observer");
		pMain.setLayout(new BorderLayout());
		lbValueSlider.setText(String.valueOf(slider.getValue()));
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				lbValueSlider.setText(String.valueOf(slider.getValue()));
				controlImage.setMeasurement(slider.getValue(),
						slider.getValue());
			}
		});
		pSlider.add(lbValueSlider);
		pSlider.add(slider);
		pMain.add(pSlider,BorderLayout.SOUTH);
		pMain.add(drawing,BorderLayout.CENTER);
		getContentPane().add(pMain);

		setSize(800, 500);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(User.controlImage.loadImage(), 100, 100, width, height,
				null);
	}



}
