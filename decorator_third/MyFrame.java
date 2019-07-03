package decorator_third;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame  extends JFrame{
	JPanel panelMain=new JPanel();
	public MyFrame(){
		setFocusable(true);
		setTitle("Button Decorator");
		setSize(500, 300);
		setLocationRelativeTo(null);
		panelMain.add(new CoolButton(new JButton("No parttern")));
		panelMain.add(new SlashButton(new CoolButton(new JButton("Draw"))));
		panelMain.add(new DecoButton(new JButton("Exit")));
		getContentPane().add(panelMain);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
