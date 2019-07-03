package observer_sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class User extends JFrame {
	static ControlSound controlSound=new ControlSound();
	long timeStop;
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panelMain=new JPanel();
	JLabel label;
	JButton buttonStop;
	JButton buttonResume;
	public static JSlider slider=new JSlider(JSlider.VERTICAL,-10,6,-10);
	
	public User( ){
		setTitle("Observer Sound");
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				label.setText(String.valueOf(slider.getValue()));
				controlSound.setVolume(slider.getValue());
			}
		});
		label=new JLabel();
		label.setText(String.valueOf(slider.getValue()));
		buttonStop=new JButton("Stop");
		buttonStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timeStop=controlSound.clip.getMicrosecondPosition();
				controlSound.clip.stop();
				
			}
		});
		buttonResume=new JButton("Resume");
		buttonResume.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlSound.clip.setMicrosecondPosition(timeStop);
				controlSound.clip.start();
				
			}
		});
		panel1.add(slider);
		panel2.add(label);
		panel2.add(buttonStop);
		panel2.add(buttonResume);
		panelMain.add(panel1);
		panelMain.add(panel2);
		setSize(400,300);
		add(panelMain);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
