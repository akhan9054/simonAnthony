package simonAnthony;

import guiPractice.GUIApplication;

public class SimonGameAnthony extends GUIApplication {

	public SimonGameAnthony(int width,int height) {
		super(width, height);
	}

	@Override
	protected void initScreen() {
		SimonScreenAnthony s = new SimonScreenAnthony(getWidth(), getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		SimonGameAnthony game = new SimonGameAnthony(1000, 1000);
		Thread app = new Thread(game);
		app.start();
	}

}
