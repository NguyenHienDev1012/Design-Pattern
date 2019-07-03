package observer_sound;

import java.util.Observable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import observer_audio.Main;


public class ControlSound extends Observable {
	public static FloatControl gainControl;
	public static Clip clip;
	private int volume;

	public ControlSound() {
		try {
			playMusic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setVolume(int newVolume) {
		this.volume = newVolume;
		measurementChanged();

	}

	public int getVolume() {
		return this.volume;
	}

	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public void playMusic() throws Exception {
		AudioInputStream audioInputStream = AudioSystem
				.getAudioInputStream(Main.class
						.getResource("TinhYeuKhongTheNamGiuHold.wav"));
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		gainControl = (FloatControl) clip
				.getControl(FloatControl.Type.MASTER_GAIN);
		// System.out.println(gainControl.getValue());
		clip.start();

	}
}
