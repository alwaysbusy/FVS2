package uk.ac.york.cs.sepr.fvs.taxe.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import uk.ac.york.cs.sepr.fvs.taxe.TaxeGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//Set window size
		config.height = 768;
		config.width = 1366;
		config.fullscreen = true;
		new LwjglApplication(new TaxeGame(), config);
	}
}