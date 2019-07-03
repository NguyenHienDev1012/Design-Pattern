package observer_image_zoom;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;

public class Controlmage extends Observable {
	private int width;
	private int height;
	static Image image;
	public void setMeasurement(int width, int height) {
		this.width = width;
		this.height = height;
		measurementChanged();

	}

	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	public  Image loadImage(){
		try {
			 image=ImageIO.read(Controlmage.class.getResource("image1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

}
