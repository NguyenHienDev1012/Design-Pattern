package observer_drawmultiple_shape;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class UserChange extends MyFrame
{
	public Shape s = new Shape();
	JSlider s1 = new JSlider(JSlider.HORIZONTAL,0,10,3);
     
	JSlider s2 = new JSlider();
	JSlider s3 = new JSlider();
	JSlider s4 = new JSlider();
	JLabel lbx1=new JLabel("X1");
	JLabel lby1=new JLabel("Y1");
	JLabel lbx2=new JLabel("X2");
	JLabel lby2=new JLabel("Y2");
	JLabel resultx1=new JLabel(String.valueOf(s1.getValue()));
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panelMain;
	private JTextField tf1, tf2, tf3, tf4;
	JButton button;

	private int x1, y1, x2, y2;

	public UserChange() {
		setTitle("User Change");
		panelMain = new JPanel();
		panelMain.setLayout(new GridLayout(2, 1));
		panel1 = new JPanel();
		panel1.setBackground(Color.white);

		button = new JButton("OK");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				x1 = Integer.parseInt(tf1.getText());
				y1 = Integer.parseInt(tf2.getText());
				x2 = Integer.parseInt(tf3.getText());
				y2 = Integer.parseInt(tf4.getText());
				s.setMeasurements(x1, y1, x2, y2);

			}
		});
		s1.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				s.setX1(s1.getValue());
				resultx1.setText(String.valueOf(s1.getValue()));
			}
		});
		s2.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				s.setY1(s2.getValue());
			}
		});
		s3.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				s.setX2(s3.getValue());
			}
		});

		s4.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				s.setY2(s4.getValue());
			}
		});
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 2));
		tf1 = new JTextField(5);
		tf2 = new JTextField(5);
		tf3 = new JTextField(5);
		tf4 = new JTextField(5);

		panel1.add(tf1);
		panel1.add(tf2);
		panel1.add(tf3);
		panel1.add(tf4);
		panel1.add(button);
		panel2.add(lbx1);
		panel2.add(resultx1);
		panel2.add(s1);
		panel2.add(lby1);
		panel2.add(s2);
		panel2.add(lbx2);
		panel2.add(s3);
		panel2.add(lby2);
		panel2.add(s4);

		panelMain.add(panel1);
		panelMain.add(panel2);
		add(panelMain);
		validate();
	}

}
