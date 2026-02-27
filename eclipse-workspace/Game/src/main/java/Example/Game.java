package Example;
import java.io.IOException;
import java.util.*;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.InfoCmp;
public class Game {
	public static void main(String args[]) throws IOException {
		//Create Term
		Terminal term = TerminalBuilder.builder().system(true).build();
		term.enterRawMode();
		//create Line Reader
		//LineReader read = LineReaderBuilder.builder().terminal(term).build();
		int key = term.reader().read();
		System.out.println(key);
		System.out.println("----\nGame\n----");
		Scanner in = new Scanner(System.in);
		Player pl = new Player(); 
		System.out.print("Please input your name!\n>> ");
		pl.name = in.nextLine();
		long fps = 60;
		long mil = 1000000000;
		long target = mil / fps;
		boolean on = true;
		float timer = 0;
		
		long lastCult = System.nanoTime();
		do {
			long start = System.nanoTime();

			long now = System.nanoTime();
			if (now-lastCult >= mil) {
				pl.cultivate(args);
				lastCult = now;
			}
			
			
			
			long end = System.nanoTime();
			long framet = end - start;
			
			if (framet < target) {
				long sleepT = (target-framet) / 1000000;
				try {
					Thread.sleep(sleepT);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
			
		} while (on);
		in.close();

	}
}
