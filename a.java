import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class a extends MIDlet {
	public Display display = null;

	private a5 a = null;

	public void startApp() {
		this.display = Display.getDisplay(this);
		try {
			if (a == null) {
				//a = new a5(this);
			}
			a.H();
			display.setCurrent(a);
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pauseApp() {
		a5.D();
	}

	protected void destroyApp(boolean paramBoolean) {
		notifyDestroyed();
	}
}