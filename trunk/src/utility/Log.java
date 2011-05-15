package utility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
	public static void main(String[] argu) {
		Logger l = Logger.getLogger("log");
		remove(l);
		Logger p = l.getParent();
		while (p != null) {
			remove(p);
			p = p.getParent();
		}
		
		ConsoleHandler ch = new ConsoleHandler();
		l.addHandler(ch);
		ch.setLevel(Level.FINER);
		l.info("This is a test.");
	}

	private static void remove(Logger l) {
		Handler[] h = l.getHandlers();
		for (int i=0; i<h.length; i++) {
			l.removeHandler(h[i]);
		}
	}
}
